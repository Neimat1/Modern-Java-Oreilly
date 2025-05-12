package com.learnJava.functionalInterfaces;

public class FunctionExample1 {
    static String performConcat(String str) {
        return FunctionExample.functionDoSomethingElse.apply(str);
    }

    public static void main(String[] args) {
        String result = performConcat("Hello");

        System.out.println("Result: " + result);
    }
}
