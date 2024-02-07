package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return ("Figure: Rectangle, area: " + getArea() + " sq.units, width: "
                + width + " units, height: " + height + " units, color: " + getColor());
    }
}
