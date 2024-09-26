package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getValue() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, width: "
                + width + " units, height: " + height + " units, color: "
                + getColor();
    }
}
