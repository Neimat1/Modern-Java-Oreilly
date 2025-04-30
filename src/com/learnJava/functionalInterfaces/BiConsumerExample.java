package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * BiConsumer is a functional interface
 * It has only one abstract method accept()
 * It takes two arguments and returns nothing
 * It is used to perform operations on the given arguments
 * It is a part of java.util.function package
 */

public class BiConsumerExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    static BiConsumer<String, List<String>> nameAndActivities = (name, activityList) -> {
        System.out.println(name + " : " + activityList);
    };


    public static void printNameAndActivities() {
        System.out.println("\nPrinting student names and activities:- ");
        studentList.forEach(student ->
                nameAndActivities.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a : " + a + " b: " + b);
        };

        biConsumer.accept("Java21", "Java24");

        BiConsumer<Integer, Integer> multiply = (num1, num2) -> {
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
        };

        BiConsumer<Integer, Integer> subtraction = (num1, num2) -> {
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
        };

        multiply.andThen(subtraction).accept(10, 5);

        printNameAndActivities();

    }
}
