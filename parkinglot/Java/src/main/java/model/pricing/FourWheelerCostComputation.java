package main.java.model.pricing;

import main.java.model.ticket.Ticket;

public class FourWheelerCostComputation extends CostComputation {

  public FourWheelerCostComputation(PricingStratergy pricingStratergy) {
    super(pricingStratergy);
  }

  @Override
  public int calculatePrice(Ticket ticket) {
    return 4 * pricingStratergy.price(ticket);
  }
}
