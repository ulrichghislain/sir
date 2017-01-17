package domain;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
@Entity
public class Person {
	
	
	private int id;

    
	private String nom;

    private String prenom;
    
    private String email;
    @Transient
    Collection <residence> residence;
    @Transient
    Collection <ElectronicDevices> electro ;
    @Transient
    Collection<Person> friends;
    
public Person() {
	
}


public Person(int id, String nom, String prenom, String email,Collection<domain.residence> residence,Collection<ElectronicDevices> ElectronicDevices, Collection<Person> friends ) {
	
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.residence = residence;
	this.electro = electro;
	this.friends = friends;
}


@Id
@GeneratedValue
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNom() {
	return nom;
}
@OneToMany(mappedBy = "person", cascade = CascadeType.PERSIST)

public Collection<ElectronicDevices> getElectro() {
	return electro;
}

public void setElectro(Collection<ElectronicDevices> electro) {
	this.electro = electro;
}



public void setNom(String nom) {
	this.nom = nom;
}
@ManyToMany
public Collection<Person> getFriends() {
	return friends;
}


public void setFriends(Collection<Person> friends) {
	this.friends = friends;
}


public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@OneToMany(mappedBy = "person", cascade = CascadeType.PERSIST)

public Collection<residence> getResidence() {
	return residence;
}

public void setResidence(Collection<residence> residence) {
	this.residence = residence;
}
}
    
 