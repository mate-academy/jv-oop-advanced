package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area " + getArea() + " sq.units, width "
                + getWidth() + " units, height " + getHeight()
                + " units, color " + getColor();
    }

}
