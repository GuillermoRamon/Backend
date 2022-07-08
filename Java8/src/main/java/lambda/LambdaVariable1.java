package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaVariable1 {

    //Repeated varibale name not allowed

    public static void main(String[] args) {
        int i=1;
        //Consumer<Integer> c1 = (i) -> {
        Consumer<Integer> c1 = (a) -> {
            //int i=0;
            System.out.println(i);
        };
        c1.accept(i);
    }
}