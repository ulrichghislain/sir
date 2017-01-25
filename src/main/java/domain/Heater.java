package domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

public class Heater {
private long id;
@Transient
residence resid;
public Heater() {

}
public Heater(long id, residence resid) {
	super();
	this.id = id;
	this.resid = resid;
}
@Id
@GeneratedValue
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
// @ManyToOne
public residence getResid() {
	return resid;
}
public void setResid(residence resid) {
	this.resid = resid;
}
}
