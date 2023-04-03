package factorydesignPatternV2.factories;

public class SquareShapeFactory extends ShapeFactory {
    @Override
    public factorydesignPatternV2.product.Shape drawShape() {
        return new factorydesignPatternV2.product.SquareShape();
    }
}
