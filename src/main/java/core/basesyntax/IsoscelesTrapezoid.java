package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double COEFFICIENT = 0.5;
    private double side1;
    private double side2;
    private double height;

    public IsoscelesTrapezoid(String color, double side1, double side2, double height) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return COEFFICIENT * height * (side1 + side2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: Isosceles Trapezoid, area: %.1f sq.units, "
                        + "side1: %.1f units, side2: %.1f units, height: %.1f units, color: %s\n",
                getArea(), side1, side2, height, super.getColor());
    }
}
