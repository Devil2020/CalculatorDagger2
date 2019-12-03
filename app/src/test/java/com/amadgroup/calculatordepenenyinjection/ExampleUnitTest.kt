package com.amadgroup.calculatordepenenyinjection

import com.amadgroup.calculatordepenenyinjection.DI.DaggerCalculatorComponent
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val adder = DaggerCalculatorComponent.builder().build()
        val result = adder.adder.add(1.0, 2.0)!!
        assertEquals(3.0, result)
    }
}
