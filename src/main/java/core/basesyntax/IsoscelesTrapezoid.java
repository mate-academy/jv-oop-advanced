package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int sideA;
    private final int sideB;
    private final int sideH;

    public IsoscelesTrapezoid(Color color, int sideA, int sideB, int sideH) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
    }

    @Override
    public double calculateArea() {
        return ((sideA + sideB) / 2.0) * sideH;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %,.2f sq.units, side a: %d units, "
                + "side b: %d units, side h: %d units, color: %s%n",
                        calculateArea(), sideA, sideB, sideH, color.name());
    }
}
