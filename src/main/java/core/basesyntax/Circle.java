package core.basesyntax;

public class Circle implements Figures {
    private Colors color;
    private double radius;

    public Circle(double radius, Colors color) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Colors getColor() {
        return color;
    }
}
