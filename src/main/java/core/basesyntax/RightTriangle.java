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
    public String draw() {
        return "Figure: RightTriagle, area: "
                + getArea()
                + " sq. units, first leg: "
                + firstLeg
                + " units, second leg: "
                + secondLeg
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }
}
