package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color, FigureType.CIRCLE.name());
        this.radius = radius;
    }

    public String getFigureData() {
        return "radius: " + radius + " units";
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
