package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, "
                + "firstLeg: %d units, secondLeg: %d units, height: %d units, "
                + "color: %s\n",
                "isosceles trapezoid", getArea(), firstSide, secondSide, height, getColor());
    }
}
