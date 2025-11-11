package week_6.optional;

import java.util.Optional;

public class User {
    private String name;
    private int age;
    private Optional<Address> address ;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = Optional.empty();
    }
    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = Optional.ofNullable(address);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Optional<Address> getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = Optional.ofNullable(address);
    }
}
