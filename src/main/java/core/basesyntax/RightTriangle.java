package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle() {
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    public void draw() {
        System.out.println("Figure: right triangle, area: " + String.format("%.1f", getArea())
                + " sq.units, firstLeg: "
                + firstLeg + "  units, secondLeg " + secondLeg
                + "  units, color: " + super.getColor());
    }

}
