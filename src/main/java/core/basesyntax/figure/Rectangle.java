package core.basesyntax.figure;

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
    public String toString() {
        return super.toString()
                + ", width: " + width
                + ", length: " + length;
    }
}
