package abstractfactorypattern.factories;

import abstractfactorypattern.vehicles.Hyundai;
import abstractfactorypattern.vehicles.Maruti;
import abstractfactorypattern.vehicles.IVehicle;

public class OrdinaryVehicleFactory implements IVehicleFactory{
    @Override
    public IVehicle getVehicle(String company) {
        switch (company){
            case "Maruti":
                return new Maruti();
            case "Hyundai":
                return new Hyundai();
            default:
                return null;
        }
    }
}
