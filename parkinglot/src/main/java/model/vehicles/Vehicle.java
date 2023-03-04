package main.java.model.vehicles;

public class Vehicle {
  public String number;
  public VehicleType type;

  Vehicle(String vehicleNumber, VehicleType vehicleType) {
    this.number = vehicleNumber;
    this.type = vehicleType;
  }
}