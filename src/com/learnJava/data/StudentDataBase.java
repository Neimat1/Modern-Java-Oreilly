package com.learnJava.data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

    /**
     * Total of 6 students in the database
     */
    public static List<Student> getAllStudents() {
        /**
         * 2nd grade student
         */
        Student student1 = new Student("Nemo", 2, 2, "female", List.of("Reading", "Maths"));
        Student student2 = new Student("Kenny", 2, 2.5, "male", List.of("Reading", "Maths"));

        /**
         * 3rd grade student
         */
        Student student3 = new Student("Jerry", 3, 3.9, "male", List.of("Reading", "Maths"));
        Student student4 = new Student("Tom", 3, 3.9, "male", List.of("Reading", "Maths"));

        /**
         * 4th grade student
         */
        Student student5 = new Student("Mickey", 4, 4, "male", List.of("Reading", "Maths"));
        Student student6 = new Student("Donald", 4, 34, "male", List.of("Reading", "Maths"));

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);
        return students;

    }
}
