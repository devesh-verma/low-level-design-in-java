package factorydesignpattern;

import factorydesignpattern.factories.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running factory design pattern");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape squareShape = shapeFactory.getShape("SquareFactory");
        Shape rectangleShape = shapeFactory.getShape("RectangleFactory");
        squareShape.draw();
        rectangleShape.draw();
    }
}
