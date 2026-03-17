package solid.srp.compliant; 


public class FuelTank {

    private int maxFuel;
    private int remainingFuel;

    public FuelTank(int maxFuel){
        this.maxFuel = maxFuel;
        this.remainingFuel = maxFuel;
    }

    public void refuel(){
        remainingFuel = maxFuel;
    }

    public void refuel(int fuel){
        remainingFuel = Math.min(maxFuel, remainingFuel + fuel);
    }

    public void consume(){
        remainingFuel--;
    }

    public int getRemainingFuel(){
        return remainingFuel;
    }
}