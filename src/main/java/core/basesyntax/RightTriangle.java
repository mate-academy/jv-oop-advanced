package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * 0.5 * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area "
                + getArea() + " sq.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor());
    }
}
