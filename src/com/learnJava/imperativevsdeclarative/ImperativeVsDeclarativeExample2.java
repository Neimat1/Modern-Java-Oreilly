package com.learnJava.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is an example of imperative vs declarative programming.
 * The first part of the code uses imperative programming to create a list of unique integers.
 * The second part of the code uses declarative programming to achieve the same result.
 */
public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 8, 9, 10);

        /*
          This is an example of imperative programming.
         */
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : integerList) {
            if (!uniqueList.contains(integer))
                uniqueList.add(integer);
        }

        System.out.println("Unique list using imperative programming approach: " + uniqueList);

        /*
          This is an example of declarative programming.
         */
        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .toList();

        System.out.println("Unique list using declarative programming approach: " + uniqueList1);
    }
}
