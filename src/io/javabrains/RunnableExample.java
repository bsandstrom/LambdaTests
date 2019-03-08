package io.javabrains;

public class RunnableExample {

    public static void main(String[] args){

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Printed in runnable");
            }
        });

        myThread.run();


        Thread myLambdaThread = new Thread(() -> System.out.println("Lambda runnable"));
        myLambdaThread.run();
    }

}
