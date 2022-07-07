package functionalInterfaces.supplier;


import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static  Supplier<Student> studentSupplier = () -> {return  StudentDataBase.studentSupplier.get();};
    public static  Supplier<List<Student>> studentsSupplier = () -> StudentDataBase.getAllStudents();
//  --------------------------------------------------------------------
    public static void main(String[] args) {
        Student student = studentSupplier.get();
        System.out.println("Student is : " + student);
        System.out.println("Students are : " + studentsSupplier.get());
    }
}