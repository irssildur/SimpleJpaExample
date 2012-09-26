import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.derby.tools.sysinfo;

import domain.Address;
import domain.Child;
import domain.SchoolClass;

import service.ChildRepository;
import service.JpaBasedChildRepository;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager manager = factory.createEntityManager();
        
        ChildRepository repo = new JpaBasedChildRepository(manager);

        createSchoolClassTest(repo);
        listSchoolClassTest(repo);
        
        listAllChildrenTest(repo);
        
        
        
        
    }

    private static void listAllChildrenTest(ChildRepository repo) {
        for (Child child : repo.listAllChildren()) {
            System.out.println("listAllChildrenTest: " + child.toString());
        }
    }

    private static void listSchoolClassTest(ChildRepository repo) {
        for (SchoolClass schoolClass : repo.listAllSchoolClass()) {
            System.out.println("listSchoolClassTest: " + schoolClass.getChildren().toString());
        }
    }

    private static void createSchoolClassTest(ChildRepository repo) {
        
        if (repo.listAllSchoolClass().size() == 0) {
        
            SchoolClass class1 = new SchoolClass();
            SchoolClass class2 = new SchoolClass();
            
            List<Address> addr = new ArrayList<Address>();
            addr.add(new Address("Budapest1", "Futo utca1"));
            addr.add(new Address("Budapest2", "Futo utca1"));
            addr.add(new Address("Budapest3", "Futo utca1"));
            addr.add(new Address("Budapest4", "Futo utca1"));
            addr.add(new Address("Budapest5", "Futo utca1"));
            addr.add(new Address("Budapest6", "Futo utca1"));
            addr.add(new Address("Budapest7", "Futo utca1"));
            
    
            List<Child> children1 = new ArrayList<Child>();
            children1.add(new Child("Gyerek1", addr.get(0), class1));
            children1.add(new Child("Gyerek2", addr.get(1), class1));
            children1.add(new Child("Gyerek3", addr.get(2), class1));
            children1.add(new Child("Gyerek4", addr.get(3), class1));
            class1.setChildren(children1);
            
            List<Child> children2 = new ArrayList<Child>();
            children2.add(new Child("Gyerek5", addr.get(4), class2));
            children2.add(new Child("Gyerek6", addr.get(5), class2));
            children2.add(new Child("Gyerek7", addr.get(6), class2));
            class2.setChildren(children2);
            
            repo.createSchoolClass(class1);
            repo.createSchoolClass(class2);
            
        }
    }

}
