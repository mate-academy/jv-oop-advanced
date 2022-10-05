package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, "
                + "area: "
                + calculateArea()
                + " sq.units, width: "
                + width
                + " units, length: "
                + length
                + " units, color: " + getColor());
    }
}
