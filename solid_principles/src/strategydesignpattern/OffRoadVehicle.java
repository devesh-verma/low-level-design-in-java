package strategydesignpattern;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportsDrive());
    }
}
