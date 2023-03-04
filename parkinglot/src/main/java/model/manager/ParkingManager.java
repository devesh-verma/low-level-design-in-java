package main.java.model.manager;

import java.util.List;
import main.java.model.vehicles.*;
import main.java.services.IParkingStratergy;
import main.java.model.parkingspot.*;

public abstract class ParkingManager {
  List<ParkingSpot> spot;
  IParkingStratergy parkingStratergy;

  ParkingManager(List<ParkingSpot> parkingSpots, IParkingStratergy parkingStratergy) {
    this.spot = parkingSpots;
    this.parkingStratergy = parkingStratergy;
  }

  ParkingSpot findParkingSpot() {
    return this.parkingStratergy.find();
  }

  public void addParkingSpace(ParkingSpot spot) {
    this.spot.add(spot);
  }

  public void removeParkingSpace(ParkingSpot spot) {
    this.spot.remove(spot);
  }

  public void parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
    parkingSpot.parkVehicle(vehicle);
  }

  public void removeVehicle(ParkingSpot parkingSpot) {
    parkingSpot.removeVehicle();
  }
}
