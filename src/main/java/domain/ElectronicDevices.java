package domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

public class ElectronicDevices {
	private int id;
	private float consommation;
	@Transient
	residence R;

	public ElectronicDevices() {
	
	}

	public ElectronicDevices(int id, float consommation, residence r) {
		super();
		this.id = id;
		this.consommation = consommation;
		R = r;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getConsommation() {
		return consommation;
	}

	public void setConsommation(float consommation) {
		this.consommation = consommation;
	}
    @ManyToOne
	public residence getR() {
		return R;
	}

	public void setR(residence r) {
		R = r;
	}

	
}
