package strategydesignpattern;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Vehicle normalVehicle = new NormalVehicle();
        Vehicle sportsVehicle = new SportsVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();

        normalVehicle.drive();
        sportsVehicle.drive();
        offRoadVehicle.drive();
    }

}