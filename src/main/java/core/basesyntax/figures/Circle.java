package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + calculateSquare()
                + " sq. units, radius: " + radius + " units, color: " + color;
    }
}
