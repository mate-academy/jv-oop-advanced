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
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %s sq.units, "
                + "length: %s units, width: %s units, color: %s%n",
                getArea(), length, width, getColor()
        );
    }
}
