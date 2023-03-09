package abstractfactorypattern.vehicles;

public class Mercedes implements IVehicle {
    @Override
    public void average() {
        System.out.println("Average of a Mercedes car is 10Kmpl");
    }
}
