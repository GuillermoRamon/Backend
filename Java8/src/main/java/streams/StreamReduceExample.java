package streams;


import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){

        return integerList.stream()
                .reduce(1, (a,b) -> a*b);

    }

    public static Optional<Integer> performMultiplicationWithNoInitialValue(List<Integer> integerList){
        return integerList.stream()
                //(1,3,5,7)
                //.skip(2) //(5,..) since
                //.limit(2) //(..,3) until
                .reduce( (a,b) -> a*b); // performs multiplication for each element in the stream and returns a new result fo.
    }

    public static String combineStudentNames(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .distinct()
                .reduce("",(a,b) -> a.concat(b));  // performs multiplication for each element in the stream.
    }

    public static Optional<Student> getHighestGradeStudent(){
        Optional<Student> studentOptional =  StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->(s1.getGpa()>s2.getGpa()) ? s1 : s2); //if -> return s1 else -> return s2
        return studentOptional;
    }

    public static int noOfNoteBooks(){
        int noOfNoteBooks = StudentDataBase.getAllStudents().stream()
                .map(Student::getNoteBooks)
                //.reduce(0,(a,b)->a+b);
                .reduce(0,Integer::sum);
        return noOfNoteBooks;
    }

//  ------------------------------------------------------------------------------------

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,3,5,7);
        //List<Integer> integerList = Arrays.asList();

        System.out.println("Result is : " + performMultiplication(integerList));

        Optional<Integer> result = performMultiplicationWithNoInitialValue(integerList);
        if(result.isPresent())
            System.out.println("Result is : " +result.get());

        System.out.println(combineStudentNames());
        System.out.println(getHighestGradeStudent().get());

        System.out.println("noOfNoteBooks: " + noOfNoteBooks());
    }
}