package core.basesyntax;

public class RightTriangle extends Figure {
    private final int leg1;
    private final int leg2;

    public RightTriangle(String name, String color, int leg1, int leg2) {
        super(name, color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, color: %s, first leg: %d units, "
                        + "second leg: %d units, area: %.1f sq. units\n",
                getName(), getColor(), leg1, leg2, getArea());
    }
}
