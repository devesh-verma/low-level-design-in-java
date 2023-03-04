package main.java.model.parkingspot;

import java.util.Random;
import main.java.model.vehicles.Vehicle;

public class TwoWheelerSpot extends ParkingSpot {
  private static final int TWOWHEELERPARKINGPRICE = 10;

  Random rand = new Random();

  TwoWheelerSpot(Vehicle vehicle) {
    this.id = rand.nextInt(90000) + 10000;
    this.vehicle = vehicle;
    this.isEmpty = true;
    this.price = TwoWheelerSpot.TWOWHEELERPARKINGPRICE;
  }
}
