package employee;

import plane.CargoBay;
import plane.EquipmentCompartment;
import plane.PassengerCompartment;

public class CleaningEmployee extends Employee{
     private int hasWorked;
    
    public CleaningEmployee(String name){
        super(name);
    }
    
    @Override public void workOn(CargoBay CB){
        System.out.println(CB.get_desc() + " is cleaned!");
        workOn(CB.get_equipment());
    }
    
    @Override public void workOn(PassengerCompartment PC){
        if(PC.inner_exists() == 1){
            workOn(PC.get_inner());
        }
        System.out.println(PC.get_desc() + " is cleaned!");
    }
    
    @Override public void workOn(EquipmentCompartment EC){}
    
    @Override public void worked(){
        hasWorked = 1;
    }
    
    @Override public void report(){
        if(hasWorked == 1){
            System.out.println("Cleaning Employee " + get_name() + " checked the cargo bay and passenger compartments! OK!");
        }
       else System.out.println("Cleaning Employee has not yet worked!");
    }
}
