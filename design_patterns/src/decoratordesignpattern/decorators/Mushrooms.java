package decoratordesignpattern.decorators;

import decoratordesignpattern.products.BasePizza;

public class Mushrooms extends ToppingsDecorator{
    BasePizza basePizza;

    public Mushrooms(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 50;
    }
}
