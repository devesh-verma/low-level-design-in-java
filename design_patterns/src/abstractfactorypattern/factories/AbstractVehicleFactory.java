package abstractfactorypattern.factories;

public class AbstractVehicleFactory {
    public IVehicleFactory getVehicleFactory(String carType){
        switch (carType){
            case "Luxury":
                return new LuxuryVehiclesFactory();
            case "Ordinary":
                return new OrdinaryVehicleFactory();
            default:
                return null;
        }
    }
}
