package core.basesyntax;

public class Rectangle extends BaseFigure {
    private int rectangleLength;
    private int rectangleWidth;

    public Rectangle(int rectangleLength, int rectangleWidth, Color color) {
        super(color);
        this.rectangleLength = rectangleLength;
        this.rectangleWidth = rectangleWidth;
    }

    @Override
    public double getArea() {
        return rectangleLength * rectangleWidth;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.1f sq.units, length: %d units,"
                        + " width: %d units, color: %s%n",
                getArea(), rectangleLength, rectangleWidth,
                color.name().toLowerCase());
    }
}
