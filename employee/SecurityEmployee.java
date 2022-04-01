package employee;

import plane.PassengerCompartment;
import plane.EquipmentCompartment;
import plane.CargoBay;

public class SecurityEmployee extends Employee{
    private int hasWorked;
    
    public SecurityEmployee(String name){
        super(name);
    }
    
    @Override public void workOn(PassengerCompartment PC){
        if(PC.inner_exists() == 1){
            workOn(PC.get_inner());
        }
        
        System.out.println(PC.get_desc() + " is secure!");
    }
    
    @Override public void workOn(EquipmentCompartment EC){
        System.out.println(EC.get_desc() + " is secure!");
    }
    
    @Override public void workOn(CargoBay CB){
        System.out.println(CB.get_desc() + " is secure!");
        workOn(CB.get_equipment());
    }
    
    @Override public void worked(){
        hasWorked = 1;
    }
    
    @Override public void report(){
        if(hasWorked == 1){
            System.out.println("Security Employee " + get_name() + " checked the passenger compartments, cargo bay, and equipment compartments! OK!");
        }
       else System.out.println("Security Employee has not yet worked!");
    }
}
