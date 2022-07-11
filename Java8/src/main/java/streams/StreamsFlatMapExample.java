package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static void main(String[] args) {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //<Stream<List<Activites>>
                .flatMap(List::stream) //<Stream<String>
                .distinct()
                .collect(Collectors.toList());

        System.out.println("studentActivities  : " + studentActivities);

        //        incorrect
        List<List<String>> studentActivities1 = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("studentActivities1  : " + studentActivities1);


    }
}
