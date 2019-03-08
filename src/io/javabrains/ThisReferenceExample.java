package io.javabrains;

public class ThisReferenceExample {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute(){
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            //System.out.println(this); Can't use "this" here.
        });

        thisReferenceExample.execute();

    }

    @Override
    public String toString() {
        return "io.javabrains.ThisReferenceExample{}";
    }
}
