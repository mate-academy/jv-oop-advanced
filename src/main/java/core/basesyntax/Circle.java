package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + formatDouble(area(),1) + " sq.units, "
                + "radius: " + formatDouble(radius) + " units, color: " + getColor();
    }
}
