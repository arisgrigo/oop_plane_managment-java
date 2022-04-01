package plane;

import employee.SecurityEmployee;
import employee.MaintenanceEmployee;
import employee.CleaningEmployee;

public class main {
    public static void main(String[] args){
        Plane plane0 = new Plane("Commercial","AirbusA310");
        
        SecurityEmployee SE = new SecurityEmployee("Eva");
        MaintenanceEmployee ME = new MaintenanceEmployee("Aris");
        CleaningEmployee CE = new CleaningEmployee("Nikos");

        plane0.process(SE);
        plane0.process(ME);
        plane0.process(CE);

        SE.report();
        ME.report();
        CE.report();

        plane0.ready_check();
        
        System.out.println("Plane ready to take off!");
    }
    
}
