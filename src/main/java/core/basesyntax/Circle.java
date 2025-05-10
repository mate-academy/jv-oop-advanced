package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String getInfo() {
        return "Figure: circle, area: "
                + String.format("%.2f", getArea()) + " sq.units, radius: "
                + radius + " units, color: "
                + getColor();
    }
}
