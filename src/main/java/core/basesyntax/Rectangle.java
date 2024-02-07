package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

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
        System.out.println(String.format("Figure: rectangle, area: %.1f sq.units, length: %d "
                + "units, width: %d units, color: %s", getArea(), length, width, getColor()));
    }
}
