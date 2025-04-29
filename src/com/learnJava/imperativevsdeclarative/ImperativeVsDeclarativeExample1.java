package com.learnJava.imperativevsdeclarative;

import java.util.stream.IntStream;

/**
 * This is an example of imperative vs declarative programming.
 * The first part of the code uses imperative programming to calculate the sum of numbers from 1 to 10.
 * The second part of the code uses declarative programming to achieve the same result.
 */
public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {

        /*
          This is an example of imperative programming.
          It uses a for loop to iterate through the numbers from 1 to 10 and print them.
          sum is a mutable variable that is updated in each iteration.
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum using imperative programming approach: " + sum);

        /*
          This is an example of declarative programming.
          It uses a functional approach to calculate the sum of numbers from 1 to 10.
          You don't need to worry about how the sum is calculated.
         */
        int sum1 = IntStream.rangeClosed(0, 100)
                .sum();
        System.out.println("Sum using declarative programming approach: " + sum1);
    }

}
