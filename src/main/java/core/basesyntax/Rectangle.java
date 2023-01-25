package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq.units, length: "
                + this.length
                + " units, width: "
                + this.width
                + " units, color: "
                + getColor());
    }
}
