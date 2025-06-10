package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    static Consumer<Student> printStudentDetails = System.out::println;
    static Consumer<Student> getPrintStudentActivities = Student::printActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(printStudentDetails);
        System.out.println("--------------------------------------------------");
        StudentDataBase.getAllStudents().forEach(getPrintStudentActivities);
    }
}
