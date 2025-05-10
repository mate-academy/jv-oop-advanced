package core.basesyntax.figure.core;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String colorOfFigure, double width, double length) {
        super(colorOfFigure);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double obtainTheArea() {
        return width * length;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + obtainTheArea()
                + " sq.units, width: " + getWidth() + " units, length: " + getLength()
                + " units, color: " + getColorOfFigure());
    }
}
