package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle Area: " + getArea() + " sq.units"
                + " Radius: " + radius + " units"
                + " Color: " + getColor() + "\n";
    }

}
