package decoratordesignpattern;

import decoratordesignpattern.decorators.ExtraCheese;
import decoratordesignpattern.decorators.Mushrooms;
import decoratordesignpattern.products.BasePizza;
import decoratordesignpattern.products.MargeritaPizza;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating new pizza");
        BasePizza pizza = new Mushrooms(new ExtraCheese(new MargeritaPizza()));
        System.out.println("Cost of pizza is: " + pizza.cost());
    }
}
