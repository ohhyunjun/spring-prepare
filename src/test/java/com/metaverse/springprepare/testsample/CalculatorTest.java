package com.metaverse.springprepare.testsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1(){
        Calculator calculator = new Calculator();
        Double result = calculator.operate(2, "+", 3);
        System.out.println("result = "+result);

        Assertions.assertEquals(5, result);
    }
    @Test
    @DisplayName("나눗셈 테스트")
    void test2(){
        Calculator calculator = new Calculator();
        Double result = calculator.operate(24, "/", 2);
        System.out.println("result = "+result);
        Assertions.assertEquals(12, result);
    }
    @Test
    @DisplayName("")
}