package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
