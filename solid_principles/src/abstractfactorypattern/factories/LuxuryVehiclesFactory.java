package abstractfactorypattern.factories;

import abstractfactorypattern.vehicles.Bmw;
import abstractfactorypattern.vehicles.Mercedes;
import abstractfactorypattern.vehicles.IVehicle;

public class LuxuryVehiclesFactory implements IVehicleFactory {
    @Override
    public IVehicle getVehicle(String company) {
        switch (company){
            case "Mercedes":
                return new Mercedes();
            case "Bmw":
                return new Bmw();
            default:
                return null;
        }
    }
}
