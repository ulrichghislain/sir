package fr.istic.sir.rest;

import dao.*;
import domain.*;
import java.util.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {
    
    public PersonResource(){
        singleton.EntityManager.getInstance();
    }
    
    @POST
    //@Consumes("application/x-www-form-urlencoded")
    @Consumes({MediaType.APPLICATION_JSON})
    /*public Person addPerson(@FormParam("name") String name, 
    @FormParam("firstname") String firstname, 
    @FormParam("mail") String mail)*/
     public Person addPerson(Person pers)
    {
        PersonDao dao = new PersonDao();
        //Person pers = new Person(name, firstname, mail);
        System.out.println(pers.toString());
        dao.create(pers);
        return pers;
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public /*String*/Collection<Person> listPerson(){
        PersonDao dao = new PersonDao();
        return dao.findAll();
    }
    
    @PUT
    @Path("/{personId}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Person updatePerson(@PathParam("personId") String personId, Person pers)
    {
        PersonDao dao = new PersonDao();
        Person person = dao.find(Long.parseLong(personId));
        person.setFirstname(pers.getFirstname());
        person.setSurname(pers.getSurname());
        person.setMail(pers.getMail());
        return dao.update(pers);
    }
    
    @DELETE
    @Path("/{personId}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Person deletePerson(@PathParam("personId") String personId/*, Person pers*/) {
        PersonDao dao = new PersonDao();
        return dao.delete(Long.parseLong(personId));
    }

}
