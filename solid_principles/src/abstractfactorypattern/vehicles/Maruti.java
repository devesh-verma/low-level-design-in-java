package abstractfactorypattern.vehicles;

public class Maruti implements IVehicle {
    @Override
    public void average() {
        System.out.println("Average of a Maruti car is 20Kmpl");
    }
}
