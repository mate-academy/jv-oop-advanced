package core.basesyntax;

public class Circle extends Figure {

    public Circle(String color, double radius) {
        super("circle", color, new Property("radius", radius));
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(getProperty().getValue(), 2);
    }
}
