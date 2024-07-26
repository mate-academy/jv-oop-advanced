package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color, FigureList.CIRCLE.name());
        this.radius = radius;
    }

    public String getFigureData() {
        return "radius: " + radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
