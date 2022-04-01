package plane;

import employee.Employee;

public abstract class PlaneComponent {
    private String description;
    
    public PlaneComponent(String desc){
        description = desc;
    }
    
    abstract void ready_check();
    
    abstract void process(Employee employee);
    
    public String get_desc(){
        return description;
    }
}
