package domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

public class residence {
	
	
private Long id;

    
	private float taille;

    private int nbreDePieces ;
    @Transient 
    Person person ;
    @Transient
    Collection <Heater> Heater ;
    
    @Transient
    Collection <ElectronicDevices> ElectronicDevices ;

	public residence() {
	
	}

	public residence(Long id, float taille, int nbreDePieces, Person person, Collection<domain.Heater> heater,
			Collection<domain.ElectronicDevices> electronicDevices) {
		super();
		this.id = id;
		this.taille = taille;
		this.nbreDePieces = nbreDePieces;
		this.person = person;
		Heater = heater;
		ElectronicDevices = electronicDevices;
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public int getNbreDePieces() {
		return nbreDePieces;
	}

	public void setNbreDePieces(int nbreDePieces) {
		this.nbreDePieces = nbreDePieces;
	}
    @ManyToOne
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
    @OneToMany(mappedBy = "resid", cascade = CascadeType.PERSIST)

	public Collection<Heater> getHeater() {
		return Heater;
	}

	public void setHeater(Collection<Heater> heater) {
		Heater = heater;
	}
	  @OneToMany(mappedBy = "R", cascade = CascadeType.PERSIST)

	public Collection<ElectronicDevices> getElectronicDevices() {
		return ElectronicDevices;
	}

	public void setElectronicDevices(Collection<ElectronicDevices> electronicDevices) {
		ElectronicDevices = electronicDevices;
	}

	
}
