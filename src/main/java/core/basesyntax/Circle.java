package core.basesyntax;

public class Circle extends AbstractFigure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String getInfo() {
        return ("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius
                + " units, color: " + color);
    }
}
