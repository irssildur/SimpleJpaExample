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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
    
    

}
