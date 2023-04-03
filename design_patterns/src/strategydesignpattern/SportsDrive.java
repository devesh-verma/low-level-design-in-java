package strategydesignpattern;

public class SportsDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Drive");
    }
}
