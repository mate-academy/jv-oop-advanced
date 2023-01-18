package core.basesyntax;

public class Rectangle extends Figure implements GettingArea {
    private double widthSize;
    private double lengthSize;

    public Rectangle(String color, double widthSize, double lengthSize) {
        super(color);
        this.widthSize = widthSize;
        this.lengthSize = lengthSize;
    }

    @Override
    public double getArea() {
        return widthSize * lengthSize;
    }

    @Override
    public String toString() {
        return "Figure: Rectangle, " + "Color: " + this.getColor() + ", Width Size: " + widthSize
                + ", Length Size: " + lengthSize + ", Area: " + this.getArea();
    }
}
