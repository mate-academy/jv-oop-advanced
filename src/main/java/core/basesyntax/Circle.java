package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        super("circle");
        radius = FigureSupplier.getRandomProperties();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: " + getName()
              + ", area: " + getArea()
              + ", radius: " + getRadius()
              + ", color: " + getColor();
    }
}
