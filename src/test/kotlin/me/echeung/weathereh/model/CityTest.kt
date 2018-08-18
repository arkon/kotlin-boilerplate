package me.echeung.weathereh.model

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.empty
import org.hamcrest.Matchers.equalTo
import org.hamcrest.Matchers.`is` as Is
import org.junit.Before
import org.junit.Test

class CityTest {

    private lateinit var cityList: CityList

    @Before
    fun setup() {
        cityList = CityList()
    }

    @Test
    fun cities_ShouldBeEmptyByDefault() {
        assertThat(cityList.cities, Is(empty()))
    }

}