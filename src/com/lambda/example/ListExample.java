package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    private void forExample(List<String> example) {
        example.forEach(System.out::println);
    }

    private void removeExample() {
        List<String> example = new ArrayList<>(Arrays.asList("data", "data2", "data"));
        example.removeIf("data2"::equals);
        System.out.println(example.toString());
    }

    private void replaceAllExample() {
        List<String> example = new ArrayList<>(Arrays.asList("data", "data", "data"));
        example.replaceAll(x ->
                x = x + "- hi"
        );
        System.out.println(example.toString());
    }

    private void sortExample() {
        List<String> example = new ArrayList<>(Arrays.asList("data1", "data12", "data123"));
        example.sort((str1, str2) -> str2.length() - str1.length());
        System.out.println(example.toString());
    }

    private void spliteratorExample() {
        List<String> example = new ArrayList<>(Arrays.asList("data1", "data12", "data123"));
        example.spliterator();
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>(Arrays.asList("data", "data", "data"));

        ListExample example = new ListExample();
        example.forExample(input);
        example.removeExample();
        example.replaceAllExample();
        example.sortExample();
    }
}
