package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: circle Area: " + getArea() + " sq.units"
                + " Radius: " + radius + " units"
                + " Color: " + color + "\n";
    }

}
