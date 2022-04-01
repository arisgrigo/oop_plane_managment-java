package employee;

import plane.PassengerCompartment;
import plane.EquipmentCompartment;
import plane.CargoBay;

public abstract class Employee {
    private String name;
    
    public Employee(String given_name){
        name = given_name;
    }
    
    public abstract void workOn(PassengerCompartment PC);
    public abstract void workOn(EquipmentCompartment EC);
    public abstract void workOn(CargoBay CB);
        
    public abstract void worked();
    
    public abstract void report();
    
    public String get_name(){
        return name;
    }
    
}
