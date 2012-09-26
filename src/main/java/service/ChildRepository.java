package service;

import java.util.List;

import domain.Address;
import domain.Child;
import domain.SchoolClass;

public interface ChildRepository {

    public abstract List<Child> listAllChildren();

    public abstract  Child getChildById(long id);

    public abstract List<SchoolClass> listAllSchoolClass();

    public abstract void createAddress(Address address);

    public abstract void createChild(Child child);

    public abstract void createSchoolClass(SchoolClass schoolClass);

   

}