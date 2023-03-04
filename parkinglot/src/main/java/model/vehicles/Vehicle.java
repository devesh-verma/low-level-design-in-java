package main.java.model.vehicles;

public class Vehicle {
  String number;
  VehicleType type;

  Vehicle(String vehicleNumber, VehicleType vehicleType) {
    this.number = vehicleNumber;
    this.type = vehicleType;
  }
}