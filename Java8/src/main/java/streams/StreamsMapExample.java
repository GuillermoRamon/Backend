package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");

        List<String> namesList = StudentDataBase.getAllStudents().stream()
                .peek((student -> {System.out.println(student);})) //print student
                .map(Student::getName)
                .map(String::toUpperCase)
                .peek(System.out::println) //print name
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("namesList  : " + namesList);

//  ------------------------------------------------------------------------------------

        System.out.println("---------------------------------------------");

        List<Student> sortedList = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

        System.out.println("sortedList  : ");
        sortedList.forEach(System.out::println);
    }
}
