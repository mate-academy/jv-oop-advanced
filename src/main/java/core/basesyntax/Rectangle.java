package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(Color color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + String.format("%.1f", calculateArea())
                + " sq.units, side: " + width
                + " units, side: " + length
                + " units, color: " + getColor();
    }
}
