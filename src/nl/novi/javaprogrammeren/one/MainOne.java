package nl.novi.javaprogrammeren.one;

public class MainOne {

    public static void main(String[] args) {

        Person sjaak = new Person("Nick");

        sjaak.setAge(30);
        sjaak.ageOneYear();
        System.out.println("De leeftijd: " + sjaak.getAge());

    }
}
