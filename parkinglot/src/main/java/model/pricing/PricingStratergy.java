package main.java.model.pricing;

import main.java.model.ticket.Ticket;

public abstract class PricingStratergy {
  public int price(Ticket ticket) {
    return 20;
  }
}
