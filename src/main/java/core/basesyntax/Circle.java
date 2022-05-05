package core.basesyntax;

public class Circle extends Figures {
    private double radius;

    public Circle(double radius, Colors color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
