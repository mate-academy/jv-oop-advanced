package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return Math.rint((firstLeg * secondLeg) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + getArea()
                + " sq.units, firs side: " + firstLeg + " units, second side: "
                + secondLeg + " units, color " + getColor());
    }
}
