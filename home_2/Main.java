package org.example.hw2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = String.class;
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
