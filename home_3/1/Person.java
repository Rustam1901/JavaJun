package org.example.hw3.task1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Person {

   /* Задание 1: Создайте класс Person с полями name и age.
    Реализуйте сериализацию и десериализацию этого класса в файл.*/

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void serializeToFile(String filename) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(filename), this);
    }

    public static Person deserializeFromFile(String filename) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(filename), Person.class);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
