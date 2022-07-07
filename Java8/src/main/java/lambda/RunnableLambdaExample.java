package lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

//          Prior Java 8

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        //short
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1.2");
            }
        }).start();

//          In JAVA 8

        Runnable runnableLambda = () -> {System.out.println("Inside Runnable 2");};
        Runnable runnableLambdaSimple = () -> System.out.println("Inside Runnable 2.1");
        Runnable runnableLambdaMultiStatements = () -> {
            System.out.println("Inside Runnable 3");
            System.out.println("Inside Runnable 3");
        };

        new Thread(runnableLambda).start();
        new Thread(runnableLambdaSimple).start();
        new Thread(runnableLambdaMultiStatements).start();

        //short
        new Thread(() -> System.out.println("Inside Runnable 4")).start();


    }
}