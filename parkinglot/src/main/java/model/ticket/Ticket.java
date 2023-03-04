package main.java.model.ticket;

import java.util.Date;

import main.java.model.parkingspot.ParkingSpot;
import main.java.model.vehicles.Vehicle;

public class Ticket {
  private Date entryTime;
  private Vehicle vehicle;
  private ParkingSpot parkingSpot;

  public Ticket(Date entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
    this.entryTime = entryTime;
    this.vehicle = vehicle;
    this.parkingSpot = parkingSpot;
  }

  public Date getEntryTime() {
    return this.entryTime;
  }

  public Vehicle getVehicle() {
    return this.vehicle;
  }

  public ParkingSpot getParkingSpot() {
    return this.parkingSpot;
  }
}
