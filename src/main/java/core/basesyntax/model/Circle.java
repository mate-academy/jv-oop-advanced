package core.basesyntax.model;

public class Circle extends Figure implements Draw, GetArea {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double areaOfFigure() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        new StringBuilder().append("Figure: Circle, area: ")
                .append(areaOfFigure())
                .append(" sq.units, radius: ")
                .append(getRadius())
                .append(" units, color: ")
                .append(getColor());
    }
}
