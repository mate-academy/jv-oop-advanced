package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super.setColor(color);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
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
