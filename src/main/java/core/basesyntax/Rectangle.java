package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq. units, width: " + String.format("%.1f", width) + " units, length: "
                + String.format("%.1f", length) + " units, color: " + getColor();
    }
}
