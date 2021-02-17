public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
