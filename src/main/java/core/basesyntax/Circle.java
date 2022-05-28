package core.basesyntax;

public class Circle extends Figure implements GetArea, ToDrawFigure {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toDraw() {
        return " Figure: circle, area: " + getArea()
                + "sq.units, radius: " + radius
                + "units, color: " + getColor();
    }
}
