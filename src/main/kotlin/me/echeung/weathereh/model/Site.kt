package me.echeung.weathereh.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty


/**
 * A single site (i.e. a city, town, etc.).
 * http://dd.weather.gc.ca/citypage_weather/xml/siteList.xml
 *
 * e.g.
 * <site code="s0000001">
 *     <nameEn>Athabasca</nameEn>
 *     <nameFr>Athabasca</nameFr>
 *     <provinceCode>AB</provinceCode>
 * </site>
 */
data class Site(
        @JacksonXmlProperty(isAttribute = true)
        val code: String = "",
        val nameEn: String = "",
        val nameFr: String = "",
        val provinceCode: String = ""
)
