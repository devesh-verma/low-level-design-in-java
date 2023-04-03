package factorydesignPatternV2.factories;

import factorydesignPatternV2.product.RectangleShape;
import factorydesignPatternV2.product.Shape;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape drawShape(){
        return new RectangleShape();
    }
}
