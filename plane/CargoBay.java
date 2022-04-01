package plane;

import employee.Employee;

public class CargoBay extends PrivateCompartment{
    private EquipmentCompartment equipment;
    
    public CargoBay(String desc){
        super(desc);
        equipment = new EquipmentCompartment("CargoBayEquipment");
    }
    
    @Override public void ready_check(){
        equipment.ready_check();
        System.out.println("Cargo Bay " + get_desc() + " OK!");
    }
    
    @Override public void process(Employee employee){
        employee.workOn(this);
    }
    
    public EquipmentCompartment get_equipment(){
        return equipment;
    }
}
