package domain;

public class Address {

    private long id;
    public String city;
    public String street;
    
    public Address() {
        super();
    }

    public Address(String city, String street) {
        super();
        this.city = city;
        this.street = street;
    }

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
