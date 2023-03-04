package main.java.model.factories;

import java.util.List;

import main.java.model.manager.ParkingManager;
import main.java.model.vehicles.Vehicle;
import main.java.services.IParkingStratergy;
import main.java.model.manager.*;
import main.java.model.parkingspot.ParkingSpot;

public class ParkingManagerFactory {
  public static ParkingManager getParkingManager(Vehicle vehicle, List<ParkingSpot> parkingSpots,
      IParkingStratergy parkingStratergy) {
    switch (vehicle.type) {
      case TWOWHEELER:
        return new TwoWheelerParkingManager(parkingSpots, parkingStratergy);
      case FOURWHEELER:
        return new FourWheelerParkingManager(parkingSpots, parkingStratergy);
      default:
        return null;
    }
  }
}
