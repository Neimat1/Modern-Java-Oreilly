package com.learnJava.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> function = name -> name.toUpperCase();
    static Function<String, String> functionDoSomethingElse = name -> name.concat(" - Do Something Else");

    public static void main(String[] args) {
        System.out.println(function.apply("Java 8"));
        System.out.println(function.andThen(functionDoSomethingElse).apply("Java 8"));
        System.out.println(function.compose(functionDoSomethingElse).apply("Java 8"));
    }
}