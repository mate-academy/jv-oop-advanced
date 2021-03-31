package core.basesyntax;

public class Rectangle extends Figure implements Drawable {
    private double length = Math.random() * 10;
    private double width = Math.random() * 10;

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
    public String drawFigure() {
        return "Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq. units, length: " + String.format("%.1f", length)
                + " units, height: " + String.format("%.1f", width)
                + " units, color: " + getColor();
    }
}
