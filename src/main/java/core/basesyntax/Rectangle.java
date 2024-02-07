package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int longitude;

    public Rectangle(String color, int width, int longitude) {
        super(color);
        this.width = width;
        this.longitude = longitude;
    }

    @Override
    public double getArea() {
        return width * longitude;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, width: "
                + width + " units, length: " + longitude + " units, color: " + color);
    }
}
