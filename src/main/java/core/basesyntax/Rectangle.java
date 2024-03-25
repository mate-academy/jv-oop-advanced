package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(int width, int length, Color color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return (double) width * length;
    }

    @Override
    public String getFigureInfo() {
        return null;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq. units, width: " + width + " units, length: " + length
                + " units, color: " + getColor().name().toLowerCase();
    }
}
