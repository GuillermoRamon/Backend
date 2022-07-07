package functionalInterfaces.consumer;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
//        two arguments
        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
//        an argument
//        Consumer<String> stringConsumer = (name) -> System.out.println("name is  :" + name);
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((s) -> studentBiConsumer.accept(s.getName(),s.getActivities()));
    }
//  --------------------------------------------------------------------
    public static void main(String[] args) {
        BiConsumer<String, String> stringBiConsumer = (a,b) -> {System.out.println(" a : "  +  a + " b : " + b );};
        stringBiConsumer.accept("java7" , "java8");

        BiConsumer<Integer, Integer> multiply = (a,b) -> {System.out.println("Multiplication : " + (a * b));};

        BiConsumer<Integer, Integer> addition = (a, b) -> {System.out.println("Addition : " + (a + b));};

        BiConsumer<Integer, Integer> division = (a,b) -> {System.out.println("Division : "  + (a / b));};

        multiply.andThen(addition).andThen(division).accept(10,5);

        nameAndActivities();

    }
}