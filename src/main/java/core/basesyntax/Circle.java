package core.basesyntax;

public class Circle extends Figure {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + name +
                ", Figure area: " + calculateArea() +
                ", Figure parameters: radius=" + radius +
                ", Figure color: " + color);
    }
}
