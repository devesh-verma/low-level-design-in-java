package strategydesignpattern;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDrive());
    }
}
