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
    public double obtainTheArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + obtainTheArea()
                        + " sq.units, length: " + this.length + " units, width: " + this.width
                        + " units, color: " + super.getColor().toLowerCase());
    }
}
