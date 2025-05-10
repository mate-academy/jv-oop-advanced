package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double side1;
    private final double side2;
    private final double height;

    public IsoscelesTrapezoid(String color, double side1, double side2, double height) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq.units, side1: " + side1 + " sq.units, side2: " + side2
                + " sq.units, height: " + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * (side1 + side2) * height;
    }
}
