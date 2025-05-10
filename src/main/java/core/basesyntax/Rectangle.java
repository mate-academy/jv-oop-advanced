package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(double width, double length, Color color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, "
                + "area: " + Math.floor(getArea()) + " sq.units, "
                + "width: " + width + " units"
                + ", length: " + length + " units"
                + ", color: " + getColor().name().toLowerCase());
    }
}
