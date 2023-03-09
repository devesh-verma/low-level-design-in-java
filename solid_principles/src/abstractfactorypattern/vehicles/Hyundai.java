package abstractfactorypattern.vehicles;

public class Hyundai implements IVehicle {
    @Override
    public void average() {
        System.out.println("Average of a Hyundai car is 30Kmpl");
    }
}
