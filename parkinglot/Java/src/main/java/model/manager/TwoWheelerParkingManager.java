package main.java.model.manager;

import java.util.List;

import main.java.model.parkingspot.ParkingSpot;
import main.java.model.parkingstratergies.Default;
import main.java.services.IParkingStratergy;

public class TwoWheelerParkingManager extends ParkingManager {

  public TwoWheelerParkingManager(List<ParkingSpot> parkingSpots) {
    super(parkingSpots, new Default());
  }

  public TwoWheelerParkingManager(List<ParkingSpot> parkingSpots, IParkingStratergy parkingStratergy) {
    super(parkingSpots, parkingStratergy);
  }
}
