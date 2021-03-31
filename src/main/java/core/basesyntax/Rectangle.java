package core.basesyntax;

public class Rectangle extends Figure {
    public static final int RANGE = 10;
    private double length;
    private double width;

    public Rectangle() {
        this.length = Math.random() * RANGE;
        this.width = Math.random() * RANGE;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq. units, length: " + String.format("%.1f", length)
                + " units, height: " + String.format("%.1f", width)
                + " units, color: " + getColor());
    }
}
