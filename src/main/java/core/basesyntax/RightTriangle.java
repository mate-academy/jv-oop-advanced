package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " sq.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: "
                + getColor());
        return null;
    }
}
