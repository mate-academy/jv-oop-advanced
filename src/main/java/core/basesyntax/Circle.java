package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        setFigure(FigureType.CIRCLE);
        setRadius(radius);
        setColor(color);
        double area = Math.round(getCalculatedArea());
        setArea(area);
    }

    @Override
    public double getCalculatedArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawDetails() {
        System.out.println(
                String.format("Figure: %s, area: %s sq.units, radius: %s units, color: %s",
                getFigure().toLowerCase(),
                getArea(),
                getRadius(),
                getColor().toString().toLowerCase())
        );
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
