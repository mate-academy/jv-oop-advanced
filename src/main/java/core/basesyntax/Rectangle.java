package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double length;

    public Rectangle(Color color, double width, double length) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle - " + "area: " + getArea() + "sq.units, "
                + "width: " + this.width + " length: " + this.length + " units, "
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
