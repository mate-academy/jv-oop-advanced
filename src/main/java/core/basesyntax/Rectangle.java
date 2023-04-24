package core.basesyntax;

public class Rectangle extends Figure {
    private double high;
    private double width;

    public Rectangle(double high, double width, String color) {
        super(color);
        this.high = high;
        this.width = width;
    }

    @Override
    public double getArea() {
        return high * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, high: "
                + high + " units, width: "
                + width + " units, color: " + color);

    }
}
