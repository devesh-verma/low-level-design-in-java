package factorydesignpattern;

import factorydesignpattern.factories.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running factory design pattern");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape squareShape = shapeFactory.getShape("Square");
        Shape rectangleShape = shapeFactory.getShape("Rectangle");
        squareShape.draw();
        rectangleShape.draw();
    }
}
