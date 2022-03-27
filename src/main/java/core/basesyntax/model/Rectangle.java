package core.basesyntax.model;

public class Rectangle extends Figure implements AreaCalculator {
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Figure: rectangle, area: ").append(getArea())
                .append(" sq.units, length: ").append(length)
                .append(" units, width: ").append(width)
                .append(" units, color: ").append(getColor()).toString();
    }
}
