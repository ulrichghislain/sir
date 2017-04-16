package dao;

import domain.*;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class HomeDao implements Dao<Home> {
    private EntityManager em;
    private EntityTransaction et;

    public HomeDao(){
        em = singleton.EntityManager.getInstance();
        et = em.getTransaction();
    }
    public void create(Home entity){
        if(entity != null){
            et.begin();
            em.persist(entity);
            et.commit();
        }
    }

    public Home delete(Object id) {
        Home h = em.getReference(Home.class, id);
        if(h != null)
        {
            et.begin();
            em.remove(h);
            et.commit();
            //em.clear();
        }
        return h;
    }

    public Home find(Object id){
        return (Home)(em.find(Home.class, id));    
    }

    public Home update(Home entity) {
        if(entity != null)
        {
            et.begin();
            em.merge(entity);
            et.commit();
        }
        return entity;    }

    public Collection<Home> findAll() {
        TypedQuery<Home> TQ = em.createNamedQuery("home.find.all", Home.class);
        return TQ.getResultList();
    }
}
