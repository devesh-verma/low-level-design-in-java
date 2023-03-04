package main.java.model.pricing;

import main.java.model.ticket.Ticket;

public class FourWheelerPricingStratergy extends PricingStratergy {
CostStratergyType costStratergyType;
public FourWheelerPricingStratergy(CostStratergyType costStratergyType) {
  this.costStratergyType = costStratergyType;
}
  @Override
  public int price(Ticket ticket) {
    return 80;
  }
}
