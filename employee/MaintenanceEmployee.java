package employee;

import plane.CargoBay;
import plane.EquipmentCompartment;
import plane.PassengerCompartment;

public class MaintenanceEmployee extends Employee{
     private int hasWorked;
    
    public MaintenanceEmployee(String name){
        super(name);
    }
    
    @Override public void workOn(EquipmentCompartment EC){
        System.out.println(EC.get_desc() + " is maintained!");
    }
    
    @Override public void workOn(CargoBay CB){
        System.out.println(CB.get_desc() + " is maintained!");
        workOn(CB.get_equipment());
    }
    
    @Override public void workOn(PassengerCompartment PC){}
    
    @Override public void worked(){
        hasWorked = 1;
    }
    
    @Override public void report(){
        if(hasWorked == 1){
            System.out.println("Maintenance Employee " + get_name() + " checked the cargo bay and equipment compartments! OK!");
        }
       else System.out.println("Maintenance Employee has not yet worked!");
    }
}
