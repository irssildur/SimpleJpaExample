package domain;

import java.util.List;

public class SchoolClass {

    public SchoolClass() {
        super();
    }

    public SchoolClass(List<Child> children) {
        super();
        this.children = children;
    }

    private List<Child> children;

    public List<Child> getPersons() {
        return children;
    }

    public void setPersons(List<Child> persons) {
        this.children = persons;
    }

}
