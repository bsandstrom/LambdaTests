package io.javabrains;

class MyGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello you");
    }
}