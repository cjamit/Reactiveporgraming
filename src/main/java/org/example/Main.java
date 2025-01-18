package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9);
        integerList.stream().forEach(a->System.out.println(a));
    }
}