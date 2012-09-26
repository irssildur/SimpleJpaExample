package service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
        EntityTransaction transaction = manager.getTransaction();
        List<Child> children = new ArrayList<Child>();

        transaction.begin();
        try {
            children = manager.createQuery("Select a From Child a", Child.class).getResultList();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        transaction.commit();
        return children;
    }

    @Override
    public Child getChildById(long id) {
        EntityTransaction transaction = manager.getTransaction();
        Child child = new Child();
        
        transaction.begin();
        try {
            child = manager.createQuery("Select a From Child a Where a.id = :id", Child.class).setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        transaction.commit();
        
        return child;
    }

    @Override
    public List<SchoolClass> listAllSchoolClass() {
        EntityTransaction transaction = manager.getTransaction();
        List<SchoolClass> classes = new ArrayList<SchoolClass>();

        transaction.begin();
        try {
            classes = manager.createQuery("Select a From SchoolClass a", SchoolClass.class).getResultList();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        transaction.commit();
        
        return classes;
    }

    @Override
    public void createAddress(Address address) {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        try {
            manager.persist(address);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        transaction.commit();
    }

    @Override
    public void createChild(Child child) {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        try {
            manager.persist(child);
            manager.persist(child.getAddress());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        transaction.commit();
        
    }

    @Override
    public void createSchoolClass(SchoolClass schoolClass) {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        try {
            manager.persist(schoolClass);
            for (Child child : schoolClass.getChildren()) {
                manager.persist(child);
                manager.persist(child.getAddress());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        transaction.commit();
    }

}
