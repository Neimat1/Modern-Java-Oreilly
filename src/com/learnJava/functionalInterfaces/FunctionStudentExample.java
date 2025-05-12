package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    // Function to return a map of student names and grades
    static Function<List<Student>, Map<String, Double>> studentFunction = studentList -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        studentList.forEach(student -> {
            //new requirement: add filter for grade level >= 3
            if (PredicateStudentExample.gradeLevelPredicate.test(student))
                studentGradeMap.put(student.getName(), student.getGpa());
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

    }
}
