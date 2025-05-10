package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, Color color) {
        this.length = length;
        this.width = width;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle"
                + ", area: "
                + calculateArea()
                + " sq.units"
                + ", length: "
                + length
                + " units, width: "
                + width
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}
