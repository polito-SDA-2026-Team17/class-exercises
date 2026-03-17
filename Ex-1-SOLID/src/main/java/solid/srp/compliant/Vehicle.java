package solid.srp.compliant; 


public class Vehicle {

    private FuelTank fuelTank;

    public Vehicle(int maxFuel){
        fuelTank = new FuelTank(maxFuel);
    }

    public void accelerate(){
        fuelTank.consume();
    }

    public int getRemainingFuel(){
        return fuelTank.getRemainingFuel();
    }
}