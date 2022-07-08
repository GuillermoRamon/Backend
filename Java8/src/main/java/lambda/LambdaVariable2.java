package lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value =4;

    public static void main(String[] args) {
//        int value =4;
        Consumer<Integer> c1 = (a) -> {
            value=6;
            System.out.println(a + value);
        };
        value =2;
        c1.accept(5);
    }
}