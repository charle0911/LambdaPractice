package com.lambda.example;

public class DefaultMethodExample {

    public static void main(String[] args) {
        DefaultInterface exampleA = new ExampleA();
        DefaultInterface exampleB = new ExampleB();
        exampleA.methodA();
        exampleB.methodA();
    }

    public static class ExampleA implements DefaultInterface {
        @Override
        public void methodA() {
            System.out.println("Hi! I am methodA in ExampleA");
            basicMethod();
        }
    }

    public static class ExampleB implements DefaultInterface {
        @Override
        public void methodA() {
            System.out.println("Hi! I am methodA in ExampleB");
            basicMethod();
        }
    }

    public interface DefaultInterface {
        void methodA();
        default void basicMethod() {
            System.out.println("Hi! I am basicMethod in DefaultInterface");
        }
    }
}
