package core.basesyntax.entity.figure;

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
        System.out.println(String.format(
                "Figure: rectangle, area: %.2f sq.units, color: %s, "
                        + "length: %d units, width: %d units.",
                getArea(), super.color, length, width));
    }
}
