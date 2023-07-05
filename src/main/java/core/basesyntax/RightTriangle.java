package core.basesyntax;

public class RightTriangle extends Figure {
    private final double length;
    private final double width;

    public RightTriangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: RightTriangle, area: %.2f sq.units, length: %.2f units, width: %.2f units," +
                        " color: %s%n", getArea(), length, width, getColor());
    }
}
