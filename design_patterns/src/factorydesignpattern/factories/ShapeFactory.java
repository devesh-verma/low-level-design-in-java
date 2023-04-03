package factorydesignpattern.factories;

import factorydesignpattern.Rectangle;
import factorydesignpattern.Shape;
import factorydesignpattern.Square;
import org.jetbrains.annotations.NotNull;

public class ShapeFactory {
    public Shape getShape(@NotNull String shape){
        switch (shape){
            case "SquareFactory":
                return new Square();
            case "RectangleFactory":
                return new Rectangle();
            default:
                return null;
        }
    }
}

