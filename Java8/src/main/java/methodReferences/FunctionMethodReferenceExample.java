package methodReferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String,String> toUpperCaseLambda = (s)->s.toUpperCase();
    //     Class::instancemethod
    static Function<String,String> toUpperCaseMethodRefernce = String::toUpperCase;
//  --------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("java8"));
        System.out.println(toUpperCaseMethodRefernce.apply("java8"));
    }
}