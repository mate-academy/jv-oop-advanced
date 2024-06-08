package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double area) {
        super(color);
        this.radius = area;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getDecimalFormat().format(getArea())
                + " sq. units, radius: "
                + getDecimalFormat().format(radius) + "  units, color: " + getColor();
    }
}
