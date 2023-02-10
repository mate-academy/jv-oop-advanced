package core.basesyntax.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public String drawFigure() {
        return "Figure: circle, area: " + calculateArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor();
    }
}
