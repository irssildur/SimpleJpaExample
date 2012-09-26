package service;

import java.util.List;

import javax.persistence.EntityManager;

import domain.Address;
import domain.Child;
import domain.SchoolClass;

public class JpaBasedChildRepository implements ChildRepository {

    private EntityManager manager;
    
    public JpaBasedChildRepository(EntityManager manager) {
        super();
        this.manager = manager;
    }

    @Override
    public List<Child> listAllChildren() {
       
        return null;
    }
    
    @Override
    public Child getChildById() {
        
        return null;
    }
    
    @Override
    public List<SchoolClass> listAllSchoolClass() {
        
        return null;
    }
   
    @Override
    public void createAddress(Address address) {
        
    }
    
    @Override
    public void createChild(Child child) {
        
    }
    
    @Override
    public void createSchoolClass(SchoolClass schoolClass) {
        
    }
    
}
