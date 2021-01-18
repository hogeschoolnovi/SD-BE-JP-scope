package nl.novi.javaprogrammeren.one;

public class Person {

    private String name;

    // age moet een klasse-scope worden. Deze voegen we hier toe:
    private int age;

    public Person(String name) {
        this.name = name;
    }

    // We willen met de setter de age van de klasse zetten. Dus we maken van de eerste age, this.age
    public void setAge(int age) {
        this.age = age;
    }

    public void ageOneYear() {
        this.age++;
    }

    //We voegen een getter toe

    public int getAge() {
        return age;
    }
}
