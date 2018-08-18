package me.echeung.weathereh

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import me.echeung.weathereh.model.CityList
import okhttp3.OkHttpClient
import okhttp3.Request


fun main(args: Array<String>) {
    val client = OkHttpClient()
    val request = Request.Builder()
            .url("http://dd.weather.gc.ca/citypage_weather/xml/siteList.xml")
            .build()

    val response = client.newCall(request).execute()

    val mapper = XmlMapper().registerModule(KotlinModule())
    val obj = mapper.readValue(response.body()!!.string(), CityList::class.java)

    System.out.println(obj)
}