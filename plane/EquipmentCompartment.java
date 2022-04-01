package plane;

import employee.Employee;

public class EquipmentCompartment extends PrivateCompartment{
    public EquipmentCompartment(String desc){
        super(desc);
    }
    
    @Override public void ready_check(){
        System.out.println("Equipment Compartment " + get_desc() + " OK!");
    }
    
    @Override public void process(Employee employee){
        employee.workOn(this);
    }
}
