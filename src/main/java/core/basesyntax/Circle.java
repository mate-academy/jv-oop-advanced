package core.basesyntax;

public class Circle extends AbstractFigure {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String describe() {
        return "Circle " + getColor() + " radius: " + radius + " area: " + getArea();
    }
}
