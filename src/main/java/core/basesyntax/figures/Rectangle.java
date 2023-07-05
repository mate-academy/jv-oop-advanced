package core.basesyntax.figures;

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
        System.out.printf(
                "Figure: %s, area: %.0f sq.units, length: %d units, width: %d units, color: %s%n",
                "rectangle", getArea(), length, width, color
        );
    }
}
