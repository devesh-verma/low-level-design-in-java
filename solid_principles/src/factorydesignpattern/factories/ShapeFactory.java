package factorydesignpattern.factories;

import factorydesignpattern.Rectangle;
import factorydesignpattern.Shape;
import factorydesignpattern.Square;

public class ShapeFactory {
    public Shape getShape(String shape){
        switch (shape){
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}

