package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    String getInfo() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor();
    }
}
