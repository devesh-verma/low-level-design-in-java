package main.java.model.parkingspot;

import java.util.Random;
import main.java.model.vehicles.Vehicle;

public class FourWheelerSpot extends ParkingSpot {
  private static final int FOURWHEELERPARKINGPRICE = 40;

  Random rand = new Random();

  FourWheelerSpot(Vehicle vehicle) {
    this.id = rand.nextInt(90000) + 10000;
    this.vehicle = vehicle;
    this.isEmpty = true;
    this.price = FourWheelerSpot.FOURWHEELERPARKINGPRICE;
  }
}
