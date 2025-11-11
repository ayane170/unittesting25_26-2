package week_6.optional;

import java.util.Optional;

public class Address {
    private Optional<String> streetName ;
    private String city;
    private String state;
    private String postalCode;

    public Address(String streetName, String city, String state, String postalCode) {
        this.streetName = Optional.of(streetName);
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public Optional<String> getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
