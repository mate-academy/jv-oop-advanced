package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

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
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.1f",calculateArea()) + " sq. units, length: "
                + String.format("%.1f", length) + " units, width: "
                + String.format("%.1f", width)
                + " units, color: " + getColor().toLowerCase());
    }
}
