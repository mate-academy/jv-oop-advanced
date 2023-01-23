package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, " + "area: " + getArea() + " sq.units, "
                + "width: " + getWidth() + "  units," + " length: "
                + getLength() + " units, " + " color: " + getColor());
    }
}
