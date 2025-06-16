package core.basesyntax;

public class Circle extends Figure {
    private final double radius = 10.0;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + calculateArea()
                + " sq. units, radius: " + radius + " units, color: " + color;
    }
}
