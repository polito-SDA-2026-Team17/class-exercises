package solid.ocp.compliant;

public class SportMode implements DrivingModeI {


    @Override
    public void changeMode(Vehicle vehicle) {
        vehicle.setPower(500);
        vehicle.setSuspensionHeight(10);
    }
     

    
}
