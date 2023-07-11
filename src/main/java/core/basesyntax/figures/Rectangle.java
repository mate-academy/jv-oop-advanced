package core.basesyntax.figures;

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
        System.out.printf("Figure: rectangle, area: %1$.2f sq.units, "
                        + "length: %2$d units, width: %3$d units, color: %4$s%n",
                this.getArea(), length, width, this.getColor());
    }
}
