package domain;

import java.util.Collection;

import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries(
@NamedQuery(name="home.find.all", query="select h from Home h")
)
@XmlRootElement

public class Home {
	
	
    private long id;
    private String name;
    private List<Machine> Machines = new ArrayList<Machine>();
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="FK_HOME_ID", referencedColumnName = "HOME_ID")
    
    @Id
    @Column(name="HOME_ID")
    @GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Machine> getMachines() {
		return Machines;
	}
	public void setMachines(List<Machine> machines) {
		Machines = machines;
	
	}
	
    private String area;
    private int numberOfPiece;
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
     
    public int getNumberOfPiece() {
        return numberOfPiece;
    }

    public void setNumberOfPiece(int numberOfPiece) {
        this.numberOfPiece = numberOfPiece;
    }
	public Home() {
	
	}
    
   
	public Home(String name, String area, int numberOfPiece) {
		super();
		this.name = name;
		this.area = area;
		this.numberOfPiece = numberOfPiece;
	}
	
	
	public String toString(){
        return this.name+" "+this.area+" "+this.numberOfPiece;
    } 
	
}
