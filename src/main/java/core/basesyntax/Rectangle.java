package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double length;

    public Rectangle(Color color, double width, double length) {
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
        System.out.printf("Figure: rectangle, "
                + "area: %.1f sq. units, "
                + "width: %.1f units, "
                + "length: %.1f units, color: %s%n",
                getArea(), width, length, color);
    }
}
