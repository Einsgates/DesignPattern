public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        //获取形状为circle的对象
        Shape shape1 = shapeFactory.getShape("circle");

        //调用circle draw方法
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color color1 = colorFactory.getColor("red");
        color1.fill();

        Color color2 = colorFactory.getColor("green");
        color2.fill();

        Color color3 = colorFactory.getColor("blue");
        color3.fill();
    }
}
