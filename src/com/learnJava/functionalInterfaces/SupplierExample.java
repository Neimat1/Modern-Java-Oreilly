package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier is a functional interface that does not take any input and returns a value
        Supplier<Student> studentSupplier = () -> new Student("Jerry", 3, 2.9, "male", List.of("Reading", "Maths"));
        System.out.println("Supplier Example: " + studentSupplier.get());


        Supplier<List<Student>> studentListSupplier = () -> List.copyOf(StudentDataBase.getAllStudents());
        System.out.println("Supplier Example for List of Students: " + studentListSupplier.get());


    }
}
