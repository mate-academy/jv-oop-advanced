package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(double width, double length, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("core.basesyntax.Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width
                + ", length: " + length
                + " units, color: " + getColor());
    }
}
