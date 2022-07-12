package streamsTerminal;


import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class StreamsTerminalExample {

    public static String joining(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining()); // appends all the strings to produce the output,
    }

    public static String joiningWithDelimiter(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joiningWithDelimiterWithPrefix(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","[","]"));
    }

    public static void main(String[] args) {

        System.out.println("Names : "+ joining());
        System.out.println("Names With Delimiter : "+ joiningWithDelimiter());
        System.out.println("Names With Delimiter Prefix and Suffix : "+ joiningWithDelimiterWithPrefix());

        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList())); // this avoids the additional map intermediate operation.

        System.out.println("namesList : " + namesList);
    }
}