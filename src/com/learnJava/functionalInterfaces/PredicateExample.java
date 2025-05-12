package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicateChecksEvenNumber = num -> num % 2 == 0;
    static Predicate<Integer> predicateChecksNumbersDivisibleBy5 = num -> num % 5 == 0;

    static void predicateAND() {
        System.out.println("Predicate AND : " + predicateChecksEvenNumber.and(predicateChecksNumbersDivisibleBy5).test(20));
    }

    static void predicateOR() {
        System.out.println("Predicate OR : " + predicateChecksEvenNumber.or(predicateChecksNumbersDivisibleBy5).test(20));
        System.out.println("Predicate OR : " + predicateChecksEvenNumber.or(predicateChecksNumbersDivisibleBy5).test(2));
        System.out.println("Predicate OR : " + predicateChecksEvenNumber.or(predicateChecksNumbersDivisibleBy5).test(1));
    }

    static void predicateNegate() {
        System.out.println("Predicate Negate : " + predicateChecksEvenNumber.and(predicateChecksNumbersDivisibleBy5).negate().test(20));
    }

    public static void main(String[] args) {

        predicateAND();
        predicateOR();
        predicateNegate();
    }
}
