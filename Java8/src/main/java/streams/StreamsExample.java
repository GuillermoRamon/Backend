package streams;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> gradePredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> gpaPredicate = student -> student.getGradeLevel()>=3.9;
/*
        List<String> names = Arrays.asList("adam","dan","jenny");
        names.stream();
        names.parallelStream();
*/


///        First form
        Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .collect(Collectors.toMap(Student::getName ,Student::getActivities ));

        System.out.println("studentMap  : " + studentMap);

///        Second form
        Map<String,List<String>> studentMap1 = StudentDataBase.getAllStudents().stream()
                .filter(gradePredicate)
                .collect(Collectors.toMap(Student::getName ,Student::getActivities ));

        System.out.println("studentMap1  : " + studentMap1);

///        Third form
        Map<String,List<String>> studentMap2 = StudentDataBase.getAllStudents().stream()
                .filter(gradePredicate)
                .filter(gpaPredicate)
                .peek((student -> {System.out.println(student);})) //consumer
                .collect(Collectors.toMap(Student::getName ,Student::getActivities ));

        System.out.println("studentMap2  : " + studentMap2);

    }
}