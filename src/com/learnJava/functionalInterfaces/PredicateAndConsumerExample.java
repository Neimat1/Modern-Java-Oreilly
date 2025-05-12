package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printStudents(studentList);

    }


    //checks grade level >= 3
    //checks gpa >= 3.9
    Predicate<Student> isGradeLevelAtLeast3 = student -> student.getGradeLevel() >= 3;
    Predicate<Student> isGpaAtLeast3_9 = student -> student.getGpa() >= 3.9;


    //use bi-predicate to check if student is in grade level >= 3 and gpa >= 3.9
    BiPredicate<Integer, Double> isGradeLevelAndGpaBiPredicate = (gradeLevel, gpa) ->
            gradeLevel >= 3 && gpa >= 3.9;

    //print student's name and activities
    BiConsumer<String, List<String>> printStudentNameAndActivities = (name, activities) -> {
        System.out.println(name + " : " + activities);
    };


    //print student's name and activities based on filter( grade level >= 3 and gpa >= 3.9)
    Consumer<Student> printStudentWithSpecifications = student -> {
//        if (isGradeLevelAtLeast3.and(isGpaAtLeast3_9).test(student))
        //using bi-predicate
        if (isGradeLevelAndGpaBiPredicate.test(student.getGradeLevel(), student.getGpa()))
            printStudentNameAndActivities.accept(student.getName(), student.getActivities());
    };


    //Method to print students based on filter
    public void printStudents(List<Student> studentList) {
        studentList.forEach(printStudentWithSpecifications);
    }
}
