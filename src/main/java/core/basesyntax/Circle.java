package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {

        return String.format("Figure: Circle, area: %.2f sq.units, radius: %.3f units, color: %s",
                getArea(), radius, color);
    }
}
