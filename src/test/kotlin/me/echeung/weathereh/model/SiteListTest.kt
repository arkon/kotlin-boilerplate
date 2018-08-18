package me.echeung.weathereh.model

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.empty
import org.junit.Before
import org.junit.Test
import org.hamcrest.Matchers.`is` as Is

class SiteListTest {

    private lateinit var siteList: SiteList

    @Before
    fun setup() {
        siteList = SiteList()
    }

    @Test
    fun sites_ShouldBeEmptyByDefault() {
        assertThat(siteList.sites, Is(empty()))
    }

}
