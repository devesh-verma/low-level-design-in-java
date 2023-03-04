package main.java.model.pricing;

import main.java.model.ticket.Ticket;

public class TwoWheelerPricingStratergy extends PricingStratergy {

  CostStratergyType costStratergyType;

  public TwoWheelerPricingStratergy(CostStratergyType costStratergyType) {
    this.costStratergyType = costStratergyType;
  }

  @Override
  public int price(Ticket ticket) {
    switch (this.costStratergyType) {
      case HOURLY:
        // return (new Date() - ticket.getEntryTime()) * 20;
        return 100;
      case MINUTES:
        return 60 * 1;
      default:
        return 10;
    }
  }
}
