package core.basesyntax.figure;

public class Rectangle extends AbstractFigure {
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.2f sq.units,"
                        + " width: %d units, length: %d units, color: %s%n",
                getArea(), width, length, getColor().toLowerCase());
    }
}
