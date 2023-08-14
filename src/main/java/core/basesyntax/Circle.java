package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String draw() {
        return "Figure: circle, area: " + getArea() + " sq.units, side: "
                + radius + " units, color: " + getColor();
    }
}
