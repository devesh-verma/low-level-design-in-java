package main.java.model.gates;

import main.java.model.manager.ParkingManager;
import main.java.model.pricing.CostComputation;
import main.java.model.ticket.Ticket;

public class ExitGate {
  Ticket ticket;
  ParkingManager parkingManager;

  ExitGate(Ticket ticket, ParkingManager parkingManager) {
    this.ticket = ticket;
    this.parkingManager = parkingManager;
  }

  public int calculatePrice(CostComputation costComputation) {
    int price = costComputation.calculatePrice(this.ticket);
    this.parkingManager.removeVehicle(ticket.getParkingSpot());
    return price;
  }

}
