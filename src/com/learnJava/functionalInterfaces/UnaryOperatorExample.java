package com.learnJava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = str -> str.concat(" + Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Hello"));
    }
}
