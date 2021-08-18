package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: "
                + "radius = " + radius
                + ',' + super.toString();
    }

    @Override
    public double areaCalculator() {
        return Math.PI * (radius * radius);
    }
}
