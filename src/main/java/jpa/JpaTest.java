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
import domain.Home;


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
        
        
        Collection<Home> residence  = new ArrayList <Home>();
        Collection<Person> friends  = new ArrayList <Person>();
         Collection<ElectronicDevices> ElectronicDevices ;
         ElectronicDevices = new ArrayList <ElectronicDevices>();
         
         ElectronicDevices electronicDevices1;
         ElectronicDevices electronicDevices2;
         friends  = new ArrayList <Person>();
         //Person corine;
         //Person aly;
         electronicDevices1 = new ElectronicDevices (215, 15.5,residence);
         
        if (idOfPerson == 0) {
          
            //manager.persist(residence); 
            
            manager.persist(ElectronicDevices);

            manager.persist(new Person(1, "ghislain", "ulrich", "ulrich@yahoo.fr",residence,ElectronicDevices,friends));
           manager.persist(new Person(2, "kady", "ordiams", "ordiams@yahoo.fr",residence,ElectronicDevices,friends));

        }
    }

}
