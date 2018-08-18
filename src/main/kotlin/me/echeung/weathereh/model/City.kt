package me.echeung.weathereh.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement(localName = "siteList")
data class CityList(
        @JacksonXmlProperty(localName = "site")
        @JacksonXmlElementWrapper(useWrapping = false)
        val cities: List<City> = emptyList()
)

data class City(
        @JacksonXmlProperty(isAttribute = true)
        val code: String = "",
        val nameEn: String = "",
        val nameFr: String = "",
        val provinceCode: String = ""
)
