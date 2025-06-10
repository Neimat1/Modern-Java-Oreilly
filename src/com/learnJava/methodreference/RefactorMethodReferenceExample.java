package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    static Predicate<Student> gradeLevelPredicate = RefactorMethodReferenceExample::greaterThanGradeLevel;

    static boolean greaterThanGradeLevel(Student student) {
        return student.getGradeLevel() >= 3;
    }


    public static void main(String[] args) {
        System.out.println(gradeLevelPredicate.test(StudentDataBase.studentSupplier.get()));
    }
}
