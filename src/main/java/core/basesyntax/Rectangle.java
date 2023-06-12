package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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
        return getWidth() * getLength();
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: rectangle" + ", color: "
                +
                getColor() + ", length: " + getLength() + ", width: "
                +
                getWidth() + ", area: " + getArea());
    }
}
