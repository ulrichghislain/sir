package domain;
import javax.persistence.*;

/*@Entity
@NamedQueries(
@NamedQuery(name="device.find.all", query="select m from Machine m")
)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_DEVICE")
@DiscriminatorValue("Machine")
*/


public abstract class Machine {
	  private String power;
	    private long id;
		public String getPower() {
			return power;
		}
		public void setPower(String power) {
			this.power = power;
		}
		
		
		@Id
	    @GeneratedValue
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public Machine() {
			
		}
		public Machine(String power) {
			super();
			this.power = power;
		}
	    
		

}
