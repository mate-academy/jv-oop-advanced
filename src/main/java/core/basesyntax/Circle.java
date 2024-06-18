package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + calculateArea() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
