package com.lambda.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnonymousExample {

    private void withoutLambda() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi! This function isn't using lambda");
            }
        }).start();
    }

    private void withLambda() {
        new Thread(() ->
            System.out.println("Hi! This function is using lambda")
        ).start();
    }

    private void hasParameter() {
        List<String> list = Arrays.asList("Hi", "my", "name", "is", "Charlie");
        list.sort(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s1.length()-s2.length();
            }
        });
        System.out.println(list.toString());
    }

    private void lambdaHasParameter() {
        List<String> list = Arrays.asList("Hi", "my", "name", "is", "Charlie");
        list.sort((s1, s2) -> {
                return s1.length()-s2.length();
            });
        System.out.println(list.toString());
    }

    private void makeLambdaFunction(Example example) {
        example.exampleFunction();
    }

    public static void main(String[] args) {
        AnonymousExample example = new AnonymousExample();
        example.withLambda();
        example.withoutLambda();
        example.hasParameter();
        example.lambdaHasParameter();
        example.makeLambdaFunction(() -> {
            System.out.println("Hi i make lambda function by myself");
        });
    }

    @FunctionalInterface
    public interface Example {
        void exampleFunction();
    }
}
