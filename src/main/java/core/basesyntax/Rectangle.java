package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.1f", this.getArea())
                + " sq.units, length: " + String.format("%.1f", length)
                + " units, width: " + String.format("%.1f", width)
                + " units, color: " + this.getColor());
    }
}
