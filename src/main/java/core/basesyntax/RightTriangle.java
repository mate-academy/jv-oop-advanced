package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg1;
    private int leg2;

    public RightTriangle(int leg1, int leg2, String color) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }

    @Override
    public String draw() {
        return "Figure: " + getClass().getSimpleName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "First leg " + leg1 + " units, "
                + "Second leg " + leg2 + " units, "
                + "color: " + getColor();
    }
}
