package main.java.model.pricing;

import main.java.model.ticket.Ticket;

public abstract class CostComputation {
  PricingStratergy pricingStratergy;

  public CostComputation(PricingStratergy pricingStratergy) {
    this.pricingStratergy = pricingStratergy;
  }

  public int calculatePrice(Ticket ticket) {
    return 0;
  }
}
