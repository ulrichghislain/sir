package domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("heater")
public class Heater extends Machine{
    
    public Heater(){
        super();
    }
    
    public Heater(String power){
        super(power);
    }
}