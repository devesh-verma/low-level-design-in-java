package factorydesignPatternV2.factories;
public class RectangleShapeFactory extends ShapeFactory {
    @Override
    public factorydesignPatternV2.product.Shape drawShape() {
        return new factorydesignPatternV2.product.RectangleShape();
    }
}
