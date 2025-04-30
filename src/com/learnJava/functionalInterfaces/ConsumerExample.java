package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Logger;

/**
 * Consumer is a functional interface
 * It has only one abstract method accept()
 * It takes an argument and returns nothing
 * It is used to perform operations on the given argument
 * It is a part of java.util.function package
 */
public class ConsumerExample {

    static Logger logger = Logger.getLogger(ConsumerExample.class.getName());
    static Consumer<Student> consumerPrintingStudent = student -> System.out.println(student);
    static Consumer<Student> consumerPrintingName = student -> System.out.print((student.getName()) + " ");
    static Consumer<Student> consumerPrintingActivities = student -> System.out.println((student.getActivities()));
    static Consumer<Student> consumerPrintingStudentNameAndActivities = student -> {
        System.out.print("Name: " + student.getName());
        System.out.print(", ");
        System.out.println("Activities: " + student.getActivities());
    };
    static List<Student> studentList = StudentDataBase.getAllStudents();


    public static void printName() {
        System.out.println("\nPrinting student names:- ");
        studentList.forEach(consumerPrintingName);
    }

    public static void printNameAndActivities() {
        System.out.println("\nPrinting student names and activities:- ");
        // studentList.forEach(consumerPrintingStudentNameAndActivities);
        studentList.forEach(consumerPrintingName.andThen(consumerPrintingActivities)); // Consumer chaining
    }

    public static void printNameAndActivitiesWithConditions() {
        System.out.println("\nPrinting student names and activities:- ");
        System.out.println("Printing students with GPA greater than 3");
        studentList.forEach(student -> {
            if (student.getGpa() > 3.0)
                consumerPrintingName.andThen(consumerPrintingActivities).accept(student);
            /**
             * why we use accept method here? and not in line 39
             * The accept method is explicitly used in line 48 because the andThen method returns a new Consumer
             * that chains the two consumers (consumerPrintingName and consumerPrintingActivities).
             * To execute this chained consumer for a specific student,
             * you need to call accept on it, passing the student as the argument.
             *
             * In line 39, accept is not explicitly called because
             * forEach automatically invokes the accept method of the Consumer for each element in the studentList.
             * Therefore, the accept method is implicitly used by forEach.
             */

        });
    }

    public static void printStudents() {
        System.out.println("\nPrinting students:- ");
        studentList.forEach(consumerPrintingStudent);
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());


        c1.accept("Java 8");
        printName();
        printNameAndActivities();
        printStudents();
        printNameAndActivitiesWithConditions();
    }
}
