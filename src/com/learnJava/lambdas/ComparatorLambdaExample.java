package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        /*
          Prior to Java 8, we had to create a separate class that implements the Comparator interface
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 if o1 == o2,
                // -1 if o1 < o2,
                // 1 if o1 > o2
            }
        };

        // Java 8 Lambda

        // () -> {};

        System.out.println("Result of the comparator using Lambda is : " + comparator.compare(25, 26));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("Result of the comparator using Lambda is : " + comparatorLambda.compare(26, 26));

        Comparator<Integer> comparatorLambda1 = ( a,  b) -> a.compareTo(b);

        System.out.println("Result of the comparator using Lambda is : " + comparatorLambda1.compare(27, 26));


    }
}
