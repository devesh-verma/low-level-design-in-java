package abstractfactorypattern;

import abstractfactorypattern.factories.AbstractVehicleFactory;
import abstractfactorypattern.factories.IVehicleFactory;
import abstractfactorypattern.vehicles.IVehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract factory pattern");
        AbstractVehicleFactory carType = new AbstractVehicleFactory();
        // Luxury car
        IVehicleFactory luxuryCar = carType.getVehicleFactory("Luxury");
        IVehicle mercedes = luxuryCar.getVehicle("Mercedes");
        mercedes.average();
        // Ordinary car
        IVehicleFactory ordinaryCar = carType.getVehicleFactory("Ordinary");
        IVehicle maruti = ordinaryCar.getVehicle("Maruti");
        maruti.average();

    }
}
