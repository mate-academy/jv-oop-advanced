package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double COEFFICIENT = 0.5;
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double side1, double side2, double height) {
        super(color);
        this.firstSide = side1;
        this.secondSide = side2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return COEFFICIENT * height * (firstSide + secondSide);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: Isosceles Trapezoid, area: %.1f sq.units, "
                        + "side1: %.1f units, side2: %.1f units, height: %.1f units, color: %s\n",
                getArea(), firstSide, secondSide, height, getColor());
    }
}
