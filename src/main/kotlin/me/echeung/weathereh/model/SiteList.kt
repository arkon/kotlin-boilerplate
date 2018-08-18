package me.echeung.weathereh.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement


/**
 * A list of {@link Site}s.
 * http://dd.weather.gc.ca/citypage_weather/xml/siteList.xml
 *
 * e.g.
 *
 * <siteList>
 *     <site code="s0000001">
 *         <nameEn>Athabasca</nameEn>
 *         <nameFr>Athabasca</nameFr>
 *         <provinceCode>AB</provinceCode>
 *     </site>
 *     <site code="s0000002">
 *         <nameEn>Clearwater</nameEn>
 *         <nameFr>Clearwater</nameFr>
 *         <provinceCode>BC</provinceCode>
 *     </site>
 *     [...]
 * </siteList>
 */
@JacksonXmlRootElement(localName = "siteList")
data class SiteList(
        @JacksonXmlProperty(localName = "site")
        @JacksonXmlElementWrapper(useWrapping = false)
        val sites: List<Site> = emptyList()
)
