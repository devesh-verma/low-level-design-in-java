package strategydesignpattern;

public class NormalVehicle extends Vehicle{
    NormalVehicle(){
        super(new NormalDrive());
    }
}
