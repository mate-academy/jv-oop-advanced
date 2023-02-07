package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstSide;
    private final double secondSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (height / 2) * (firstSide * secondSide);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq.units, "
                + "firstSide: %.1f units, secondSide: %.1f units, height %.1f, color: %s\n",
                calculateArea(), firstSide, secondSide, height, getColor());
    }
}
