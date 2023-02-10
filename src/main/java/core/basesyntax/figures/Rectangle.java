package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String drawFigure() {
        return "Figure: rectangle, area: " + calculateArea()
                + " sq.units, length: " + getLength()
                + " units, width: " + getWidth()
                + "units, color: " + getColor();
    }
}
