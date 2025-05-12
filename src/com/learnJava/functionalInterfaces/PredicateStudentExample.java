package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.0;


    static void filterStudentsByGpa() {
        System.out.println("filterStudentsByGpa : ");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if (gpaPredicate.test(student))
                System.out.println(student);
        });
        System.out.println("---------------------------------------------------");
    }

    static void filterStudentsByGradeLevel() {
        System.out.println("filterStudentsByGradeLevel : ");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if (gradeLevelPredicate.test(student))
                System.out.println(student);
        });
        System.out.println("---------------------------------------------------");
    }

    static void filterStudentsByGradeLevelAndGpa() {
        System.out.println("filterStudentsByGradeLevelAndGpa : ");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if (gradeLevelPredicate.and(gpaPredicate).test(student))
                System.out.println(student);
        });
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        filterStudentsByGpa();
        filterStudentsByGradeLevel();
        filterStudentsByGradeLevelAndGpa();
    }
}
