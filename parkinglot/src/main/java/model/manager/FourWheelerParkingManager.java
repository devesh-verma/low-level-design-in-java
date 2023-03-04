package main.java.model.manager;

import java.util.List;
import main.java.model.parkingspot.ParkingSpot;
import main.java.model.parkingstratergies.Default;
import main.java.services.IParkingStratergy;

public class FourWheelerParkingManager extends ParkingManager {
  FourWheelerParkingManager(List<ParkingSpot> parkingSpots) {
    super(parkingSpots, new Default());
  }

  FourWheelerParkingManager(List<ParkingSpot> parkingSpots, IParkingStratergy parkingStratergy) {
    super(parkingSpots, parkingStratergy);
  }
}
