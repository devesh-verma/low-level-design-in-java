package factorydesignPatternV2.factories;

import factorydesignPatternV2.product.Shape;
import factorydesignPatternV2.product.SquareShape;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape drawShape() {
        return new SquareShape();
    }
}
