package core.basesyntax;

public class Circle extends Figure {
    private double radiusSize;

    public Circle(String color, double radiusSize) {
        super(color);
        this.radiusSize = radiusSize;
    }

    @Override
    public double getArea() {
        return Math.PI * radiusSize * radiusSize;
    }

    @Override
    public String toString() {
        return "Figure: Circle, " + "Color: " + this.getColor() + ", Radius Size: " + radiusSize
                + ", Area: " + this.getArea();
    }
}
