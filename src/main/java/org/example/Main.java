package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ahmet", "dsadasd", 23);
        Person person2 = new Person("harun", "sefa", 28, 222222222, "Ankara", "Turkey", 1.82);



        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());

        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());




    }
}
