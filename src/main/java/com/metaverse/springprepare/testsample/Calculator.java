package com.metaverse.springprepare.testsample;

//테스트코드 소개용 계산기
public class Calculator {
    public Double operate(double num1, String op, double num2){
        switch (op){
            case "*":
                return num1 * num2;
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "/":
                if (num2 != 0){
                    return num1 / num2;
                }
                else {
                    return null;
                }
            default:
                throw new IllegalArgumentException("잘못된 연산자 입니다.");
        }
    }
}
