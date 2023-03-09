package abstractfactorypattern.factories;

import abstractfactorypattern.vehicles.IVehicle;

public interface IVehicleFactory {
    public IVehicle getVehicle(String company);
}
