package domain;

import java.util.List;

public class SchoolClass {

    private long id;
    private List<Child> children;
    
    public SchoolClass() {
        super();
    }

    public SchoolClass(List<Child> children) {
        super();
        this.children = children;
    }

    public List<Child> getPersons() {
        return children;
    }

    public void setPersons(List<Child> persons) {
        this.children = persons;
    }

}
