package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private final String color;
    private final double areaCircle;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
        this.color = color;
        this.areaCircle = areaCalculator();
    }

    @Override
    public double areaCalculator() {
        return Math.PI * radius * radius;
    }

    @Override
    public String drawable() {
        String end = " sq.units, radius: " + radius + " units, color: " + color;
        return "\nFigure: circle, area: " + areaCircle + end;

    }
}
