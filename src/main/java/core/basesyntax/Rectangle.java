package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle " + "area: "
                + getArea() + " sq.units, " + " width: "
                + getWidth() + " units, " + " length "
                + getLength() + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
