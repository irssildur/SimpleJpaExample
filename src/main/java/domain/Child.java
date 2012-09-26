package domain;

public class Child {
    
    private long id;
    private String name;
    private Address address;
    private SchoolClass schoolClass;
    
    public Child() {
        super();
    }
    
    public Child(String name, Address address, SchoolClass schoolClass) {
        super();
        this.name = name;
        this.address = address;
        this.schoolClass = schoolClass;
    }

    public SchoolClass getGroup() {
        return schoolClass;
    }

    public void setGroup(SchoolClass group) {
        this.schoolClass = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
