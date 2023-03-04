package main.java.model.parkingspot;

import main.java.model.vehicles.*;

public abstract class ParkingSpot {
  int id;
  Vehicle vehicle;
  int price;
  boolean isEmpty;

  public void parkVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    this.isEmpty = false;
  }

  public void removeVehicle() {
    this.vehicle = null;
    this.isEmpty = true;
  }
}
