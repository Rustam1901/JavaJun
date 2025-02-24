package org.example.hw3.task2;

public class Main {

    /*Задание 2: Используя JPA, создайте базу данных для хранения объектов класса Person.
    Реализуйте методы для добавления, обновления и удаления объектов Person.*/

    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

        Person person = new Person("Axe", 111);
        personDAO.addPerson(person);

        person.setName("Axe Qwe");
        personDAO.updatePerson(person);

        personDAO.deletePerson(person.getId());
    }
}
