package functionalInterfaces.function;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {
    static Predicate<Student> p = (s) -> s.getGradeLevel()>=3;
    static Function<List<Student>, Map<String, Double>> function = (students -> {
        Map<String,Double> studentGradeMap = new HashMap<>();
        students.forEach((student -> {
            if(p.test(student)){
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        }));
        return studentGradeMap;
    });
//  --------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println(function.apply(StudentDataBase.getAllStudents()));
    }
}