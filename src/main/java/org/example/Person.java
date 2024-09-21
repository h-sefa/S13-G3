package org.example;

public class Person {

    String firstName;
    String lastName;
    int age;
    long id;
    String city;
    String country;
    double height;

    public Person(String firstName, String lastName, int age) {
        this.firstName= firstName;
        this.lastName= lastName;
        this.age= age;
    }
    public Person(String firstName, String lastName, int age, long id, String city, String country, double height) {
        this(firstName, lastName, age);
        this.city= city;
        this.country= country;
        this.height= height;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return  age;
    }
    public boolean isTeen(){
        return age <= 19 && age >= 13;
    }
}







/*
*
*
* org.example paketi altında Person isimli bir sınıf tanımlayınız.

Sınıf için 3 tane instance variable tanımlayınız.

firstname String olmalı, lastName String olmalı age int olmalı.

Kendiniz Person isimli bir sınıfta olmasını isteyeceğiniz 3 adet daha instance variable ekleyiniz.

Bu sınıf için firstname, lastname ve age değerlerini alabileceğiniz bir constructor tanımlayınız.

Kendi eklediğiniz parametreleri de kullandığınız bir adet daha constructor ekleyerek overloading yapınız. Toplamda minimum 2 tane constructor olmalı.

Eklediğiniz constructor metodlarından birinin içerisinden diğerini çağırarak constructor chaining yapınız.

Person sınıfının içerisinde 4 adet method tanımlayınız.

getFirstName => firstname değerini dönmeli

getLastName => lastname değerini dönmeli.

getAge => age değerini dönmeli.

isTeen => age değeri 13-19 arasında true dönmeli. Diğer koşullarda false dönmeli.

main metodu içerisinde aşağıdaki gibi çağırımlar yapabilmelisiniz.

Person sınıfından birden fazla person instance oluşturarak. Bir sınıftan pek çok obje oluşturabilmeyi deneyimleyiniz.

Person person = new Person("John", "Doe", 20);

System.out.println("Firstname: " + person.getFirstName());

System.out.println("LastName: " + person.getLastName());

System.out.println("Age: " + person.getAge());
*
*
*
*
*
*
*
*
* */
