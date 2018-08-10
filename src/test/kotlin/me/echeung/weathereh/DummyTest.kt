package me.echeung.weathereh

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.hamcrest.Matchers.`is` as Is
import org.junit.Before
import org.junit.Test

class DummyTest {

    private lateinit var dummy: Dummy

    @Before
    fun setup() {
        dummy = Dummy()
    }

    @Test
    fun dummy() {
        assertThat(dummy.foo, Is("hello world"))
        assertThat(dummy.bar, Is(equalTo(0)))
    }

}