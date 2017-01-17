package jpa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.ElectronicDevices;
import domain.Person;
import domain.residence;


public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();

				
		tx.commit();
		
		
		// TODOs
		
		
		
		
		manager.close();
		System.out.println("done");
	}

	
	private void createPerson() {
        int idOfPerson = manager.createQuery("Select a From Person a", Person.class).getResultList().size();
        
        
        Collection<residence> residence ;
         residence = new ArrayList <residence>();
         
         Collection<ElectronicDevices> ElectronicDevices ;
         ElectronicDevices = new ArrayList <ElectronicDevices>();
         
         ElectronicDevices electronicDevices1;
         ElectronicDevices electronicDevices2;
         
         electronicDevices1 = new ElectronicDevices (215, 15.5, Residence);
         
        if (idOfPerson == 0) {
          
            manager.persist(residence);
            
            
            manager.persist(ElectronicDevices);

            manager.persist(new Person(1, "g", "f", "fhhj","ded","efe"));
            manager.persist(new Person("Captain Nemo", C));

        }
    }

}
