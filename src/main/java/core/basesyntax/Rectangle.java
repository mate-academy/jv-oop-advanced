package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, Color color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure Rectangle, area: %.1f"
                            + " sq. units, length: %.1f"
                            + " units, width: %.1f"
                            + " units, color: %s",
                            getArea(), length, width, color);
    }
}
