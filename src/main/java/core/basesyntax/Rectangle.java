package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int high;

    public Rectangle(String color, int width, int high) {
        super(color);
        this.width = width;
        this.high = high;
    }

    @Override
    public double getArea() {
        return width * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area:" + getArea() + "sq.units, width: "
                + width + " units, high: " + high + " units, color: " + color);
    }
}
