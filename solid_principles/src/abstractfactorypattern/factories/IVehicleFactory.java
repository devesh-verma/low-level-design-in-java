package abstractfactorypattern.factories;

import abstractfactorypattern.vehicles.IVehicle;

public interface IVehicleFactory {
    IVehicle getVehicle(String company);
}
