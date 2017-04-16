
package dao;

import domain.*;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class MachineDao implements Dao<Machine> {
    private EntityManager em;
    private EntityTransaction et;
    
    public MachineDao(){
        em = singleton.EntityManager.getInstance();
        et = em.getTransaction();
    }
    
    public void create(Machine entity) {
        if(entity != null){
            et.begin();
            em.persist(entity);
            et.commit();
        }
    }

    public Machine delete(Object id) {
    	Machine sd = em.getReference(Machine.class, id);
        if(sd != null)
        {
            et.begin();
            em.remove(sd);
            et.commit();
            //em.clear();
        }
        return sd;
    }

    public Machine find(Object id) {
        return (Machine)(em.find(Machine.class, id));     }

    public Machine update(Machine entity) {
        if(entity != null)
        {
            et.begin();
            em.merge(entity);
            et.commit();
        }
        return entity;
    }

    public Collection<Machine> findAll(){
        TypedQuery<Machine> TQ = em.createNamedQuery("device.find.all", Machine.class);
        return TQ.getResultList();
    }
    
}
