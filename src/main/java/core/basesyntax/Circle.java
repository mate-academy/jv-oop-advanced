package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String printFigure() {
        return "Figure: circle, area: " + String.format("%.1f", getArea())
                + " sq.units, side: " + radius
                + " units, color: " + getColor();
    }
}
