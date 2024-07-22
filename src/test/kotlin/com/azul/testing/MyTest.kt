package com.azul.testing

import io.qameta.allure.Epic
import io.qameta.allure.Feature
import org.junit.jupiter.api.*
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Epic("Miner")
@Feature("Software mining")
@Execution(ExecutionMode.CONCURRENT)
@Tag("stet")
class MyTest {
    @Test
    @DisplayName("my test")
    fun myTest() {
        println("passed")
    }
}