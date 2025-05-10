package core.basesyntax;

public class Rectangle extends Figure implements Drawable {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.1f sq.units,"
                + " length: %.1f units, secondLeg: %.1f "
                + "units, color: %s%n", getArea(), length, width, getColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
