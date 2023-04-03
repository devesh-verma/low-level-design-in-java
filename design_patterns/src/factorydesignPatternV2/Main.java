package factorydesignPatternV2;

import factorydesignPatternV2.product.RectangleShape;
import factorydesignPatternV2.product.Shape;
import factorydesignPatternV2.product.SquareShape;

public class Main {
    private static Shape shape;

    public static void main(String[] args) {
        configure("rectangle");
        runBusinessLogic();
    }

    static void configure(String s){
        if(s.equals("square")){
            shape = new SquareShape();
        } else {
            shape = new RectangleShape();
        }
    }

    static void runBusinessLogic(){
        String s = shape.draw();
        System.out.println(s);
    }
}
