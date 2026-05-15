package com.universidad.pipelineci_cd

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun setup() {
        calculator = Calculator()
    }

    @Test
    fun sumaCorrecta() {
        assertEquals(4, calculator.suma(2, 2))
    }

    @Test
    fun restaCorrecta() {
        assertEquals(5, calculator.resta(10, 5))
    }

    @Test
    fun multiplicacionCorrecta() {
        assertEquals(9, calculator.multiplicacion(3, 3))
    }

    @Test
    fun divisionCorrecta() {
        assertEquals(5, calculator.division(20, 4))
    }
}