package domain;

import java.util.List;

public class SchoolClass {

    private List<Child> children;

    public List<Child> getPersons() {
        return children;
    }

    public void setPersons(List<Child> persons) {
        this.children = persons;
    }
    
}
