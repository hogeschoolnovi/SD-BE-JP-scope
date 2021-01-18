package nl.novi.javaprogrammeren.three;

public class Phone {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Wat hieronder gebeurt heet variabele shadowing. Je hebt een variabele met dezelfde naam datatype als een
    // instantie variabele.
    // Java overschrijft die waarde dan 'tijdelijk' binnen de methode
    /*public String getInternationalPhoneNumber() {
        String phoneNumber = "+31";

        return phoneNumber;
    }
    */
    public String getInternationalPhoneNumber() {
        String internationalPrefix = "+31";

        return internationalPrefix + phoneNumber;
    }
}
