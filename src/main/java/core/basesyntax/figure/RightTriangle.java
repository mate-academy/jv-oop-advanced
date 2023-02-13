package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, "
                + "hypotenuse: %d units, leg: %d units, "
                + "color: %s\n", "right triangle", getArea(), firstSide, secondSide, getColor());
    }
}
