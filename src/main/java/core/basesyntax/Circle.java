package core.basesyntax;

public class Circle extends Figure {
    private static final double NUMBER_PI = 3.14;
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        super.setFigureColor(color);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getNumberPi() {
        return NUMBER_PI;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * radius * NUMBER_PI;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle"
                + ", area: " + getArea() + " sq.units"
                + ", radius: " + radius
                + ", color: " + super.getFigureColor());
    }
}
