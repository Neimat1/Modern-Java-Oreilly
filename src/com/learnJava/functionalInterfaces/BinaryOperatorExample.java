package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 * num2;
        System.out.println("Binary Operator Example Multiplication: " + binaryOperator.apply(2, 3));


        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Binary Operator Example Max: " + maxBy.apply(2, 3));

        BinaryOperator<Integer> minBy = BinaryOperator.maxBy(comparator);
        System.out.println("Binary Operator Example Min: " + minBy.apply(2, 3));
    }
}
