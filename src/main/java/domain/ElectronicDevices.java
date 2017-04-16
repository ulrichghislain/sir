package domain;

import javax.persistence.*;

/*@Entity
@DiscriminatorValue("electronicDevice")*/
public class ElectronicDevices extends Machine {
    
    public ElectronicDevices(){
        super();
    }
    
    public ElectronicDevices(String power){
        super(power);
    }
}