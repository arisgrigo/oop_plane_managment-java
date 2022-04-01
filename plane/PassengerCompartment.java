package plane;

import employee.Employee;
import java.util.Random;

public class PassengerCompartment extends PlaneComponent{
    private PassengerCompartment innerComp;
    
    public PassengerCompartment(String desc){
        super(desc);
        
        Random rand = new Random();
        
        int inner_exists = rand.nextInt(2); 
        
        if(inner_exists == 1){
            innerComp = new PassengerCompartment("Inner Passenger Compartment", 1);
        }else innerComp = null;
        
    }
    
    public PassengerCompartment(String desc, int isInner){
        super(desc);
    }
    
    @Override public void ready_check(){
        if(innerComp != null){
            innerComp.ready_check(1);
        }
        System.out.println("PassengerCompartment " + get_desc() + " OK!");
    }
    
    public void ready_check(int isInner){
        if(innerComp != null){
            innerComp.ready_check(1);
        }
        System.out.println("InnerPassengerCompartment " + get_desc() + " OK!");
    }
    
    public int inner_exists(){
        if(innerComp != null){
            return 1;
        }else return 0;
    }
    
    @Override public void process(Employee employee){
        employee.workOn(this);
    }
    
    public PassengerCompartment get_inner(){
        return innerComp;
    }
}
