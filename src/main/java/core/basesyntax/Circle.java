package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String nameFigure, int radius, String colorFigure) {
        super(nameFigure, colorFigure);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure"
                + ": circle"
                + ", area: " + String.format("%.2f", getArea()) + " sq.units"
                + ", radius: " + radius + " units"
                + ", color: " + getColorFigure();
    }
}
