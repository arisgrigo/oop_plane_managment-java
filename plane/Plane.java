package plane;

import employee.Employee;
import java.util.Random;

public class Plane {
    private String description;
    private String title;
    private int capacity;
    private int passengerC_capacity;
    private CargoBay cargoBay;
    private EquipmentCompartment ec0;
    private EquipmentCompartment ec1;
    private EquipmentCompartment ec2;
    private PassengerCompartment passengerCompartment[];
    
    public Plane(String desc, String title){
        description = title;
        this.title = title;
        
        cargoBay = new CargoBay("PlaneCargoBay");
        
        ec0 = new EquipmentCompartment("EquipmentCompartment0");
        ec1 = new EquipmentCompartment("EquipmentCompartment1");
        ec2 = new EquipmentCompartment("EquipmentCompartment2");
        
        Random rand = new Random();
        
        capacity = rand.nextInt(200) + 99;
        
        passengerC_capacity = (rand.nextInt(capacity/40) + 1 ) + 2;
        
        passengerCompartment = new PassengerCompartment[passengerC_capacity];
        
        for(int i=0; i< passengerC_capacity; i++){
            passengerCompartment[i] = new PassengerCompartment("PassengerCompartment" + i);
        }
        
    }
    
    public void ready_check(){
        cargoBay.ready_check();
        
        ec0.ready_check();
        ec1.ready_check();
        ec2.ready_check();
        
        for(int i=0; i< passengerC_capacity; i++){
            passengerCompartment[i].ready_check();
        }
        
        System.out.println("Plane " + get_desc() + " OK!");
    }
    
    public String get_desc(){
        return description;
    }
    
    public String get_title(){
        return title;
    }
    
    public int get_capacity(){
        return capacity;
    }
    
    public int get_pcapacity(){
        return passengerC_capacity;
    }
    
    public CargoBay get_cargoBay(){
        return cargoBay;
    }
    
    public EquipmentCompartment get_equipmentCompartment(int i){
        if(i == 0)
            return ec0;
        if(i == 1)
            return ec1;
        if(i == 2)
            return ec2;
        
        return null;
    }
    
    public PassengerCompartment get_passengerCompartment(int i){
        return passengerCompartment[i];
    }
    
    public void process(Employee employee){
        employee.workOn(cargoBay);
        
        employee.workOn(ec0);
        employee.workOn(ec1);
        employee.workOn(ec2);
        
        for(int i = 0; i < passengerC_capacity; i++){
            employee.workOn(passengerCompartment[i]);
        }
        
        employee.worked();
    }
}
