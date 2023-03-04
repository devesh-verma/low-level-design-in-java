package main.java.model.factories;

import main.java.model.pricing.CostComputation;
import main.java.model.pricing.CostStratergyType;
import main.java.model.pricing.FourWheelerCostComputation;
import main.java.model.pricing.TwoWheelerCostComputation;
import main.java.model.ticket.Ticket;
import main.java.model.pricing.*;

public class CostComputationFactory {
  public static CostComputation costComputation(Ticket ticket) {
    switch (ticket.getVehicle().type) {
      case TWOWHEELER:
        return new TwoWheelerCostComputation(new TwoWheelerPricingStratergy(CostStratergyType.HOURLY));
      case FOURWHEELER:
        return new FourWheelerCostComputation(new FourWheelerPricingStratergy(CostStratergyType.MINUTES));
      default:
        return null;
    }
  }

}
