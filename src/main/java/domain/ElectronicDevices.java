package domain;

import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

public class ElectronicDevices {
	private int id;
	private double consommation;
	@Transient
    Collection <residence> residence;

	public ElectronicDevices() {
	
	}

	public ElectronicDevices(int id, double consommation, Collection<residence> r) {
		
		this.id = id;
		this.consommation = consommation;
		this.residence=r ;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getConsommation() {
		return consommation;
	}

	public void setConsommation(float consommation) {
		this.consommation = consommation;
	}
	 @ManyToOne
	public Collection<residence> getResidence() {
		return residence;
	}

	public void setResidence(Collection<residence> residence) {
		this.residence = residence;
	}
   
	
	
}
