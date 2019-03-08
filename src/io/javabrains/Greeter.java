package io.javabrains;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }


    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        MyGreeting myGreeting = new MyGreeting();
        Greeting lambdaGreeting = () -> System.out.println("hello worldywold");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("test inner");
            }
        };

        greeter.greet(innerClassGreeting);

    }

}