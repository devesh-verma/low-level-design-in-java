package abstractfactorypattern.vehicles;

public class Bmw implements IVehicle {
    @Override
    public void average() {
        System.out.println("Average of a BMW car is 5Kmpl");
    }
}
