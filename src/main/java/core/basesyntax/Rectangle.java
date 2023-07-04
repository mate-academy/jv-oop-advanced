package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double findArea() {
        return length * width;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: rectangle, area: "
                + findArea() + " sq.units, length: "
                + length + " units, width: "
                + width + " units, color: " + getColor());
    }
}
