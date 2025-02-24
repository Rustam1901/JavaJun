package org.example.hw3.task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Axe", 101);
            person.serializeToFile("person.json");
            Person deserializedPerson = Person.deserializeFromFile("person.json");
            System.out.println(deserializedPerson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

