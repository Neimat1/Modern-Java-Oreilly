package com.learnJava.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    public static void main(String[] args) {
        Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
        System.out.println("Using Lambda: " + toUpperCaseLambda.apply("hello"));

        Function<String, String> toUpperCaseMethodReference = String::toUpperCase;
        System.out.println("Using Method Reference: " + toUpperCaseMethodReference.apply("hello"));
    }
}
