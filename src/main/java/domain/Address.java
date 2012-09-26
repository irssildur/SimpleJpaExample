package domain;

public class Address {

    public Address() {
        super();
    }

    public Address(String city, String street) {
        super();
        this.city = city;
        this.street = street;
    }

    public String city;
    public String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
