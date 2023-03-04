package main.java.model.gates;

import java.util.Date;
import main.java.model.manager.ParkingManager;
import main.java.model.parkingspot.ParkingSpot;
import main.java.model.ticket.Ticket;
import main.java.model.vehicles.Vehicle;

public class EntryGates {
  Vehicle vehicle;
  Ticket ticket;
  ParkingManager parkingManager;
  String gateNumber;

  EntryGates(Vehicle vehicle, String gateNumber, ParkingManager parkingManager) {
    this.vehicle = vehicle;
    this.parkingManager = parkingManager;
    this.gateNumber = gateNumber;
  }

  private ParkingSpot findParkingSpot() {
    return this.parkingManager.findParkingSpot();
  }

  private ParkingSpot bookSpot() {
    ParkingSpot parkingSpot = this.findParkingSpot();
    this.parkingManager.parkVehicle(parkingSpot, this.vehicle);
    return parkingSpot;
  }

  public Ticket generateTicket() {
    Date d = new Date();
    return new Ticket(d, this.vehicle, this.bookSpot());
  }
}
