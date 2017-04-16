package factory;

import dao.*;

public class FactoryDao {
    
    private FactoryDao(){   
    }
    
    public static PersonDao getPersonDao(){
        return new PersonDao();
    }
    
    public static HomeDao getHomeDao(){
        return new HomeDao();
    }
}
