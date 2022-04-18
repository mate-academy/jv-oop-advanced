package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        setColor(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + Math.ceil(getArea() * Math.pow(10, 1)) / Math.pow(10, 1)
                + " sq.units, width: "
                + width
                + " units, height: "
                + height
                + " units, color: "
                + getColor().toLowerCase();
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
