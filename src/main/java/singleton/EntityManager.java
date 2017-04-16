package singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EntityManager {
    
    private static EntityManagerFactory emf;
    private static javax.persistence.EntityManager em;
    private static String persistence_unit_name = "dev";
    
    private EntityManager(){
        emf = Persistence.createEntityManagerFactory(persistence_unit_name);
        em = emf.createEntityManager();

    }
    
    public static void setPersistenceUnitName(String persistence_unit_name){
        EntityManager.persistence_unit_name = persistence_unit_name;
    }
    
    public static String getPersistenceUnitName(){
        return EntityManager.persistence_unit_name;
    }
    
    public static synchronized javax.persistence.EntityManager getInstance(){
        if(em == null)
            new EntityManager();
        return em;
    }
    
    public static void close(){
        em.close();
        emf.close();
    }
    
}
