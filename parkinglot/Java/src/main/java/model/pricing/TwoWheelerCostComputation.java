package main.java.model.pricing;

import main.java.model.ticket.Ticket;

public class TwoWheelerCostComputation extends CostComputation {

  public TwoWheelerCostComputation(PricingStratergy pricingStratergy) {
    super(pricingStratergy);
  }

  @Override
  public int calculatePrice(Ticket ticket) {
    return 2 * pricingStratergy.price(ticket);
  }
}
