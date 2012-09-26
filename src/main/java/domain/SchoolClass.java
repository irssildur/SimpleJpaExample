package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SchoolClass {

    @GeneratedValue
    @Id
    private long id;
    @OneToMany(mappedBy="schoolClass")
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
