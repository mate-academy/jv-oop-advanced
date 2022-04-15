package core.basesyntax;

public class RightTriangle extends Figure implements Area {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toDraw() {
        return "Figure: triangle, area: "
                + Math.ceil(getArea() * Math.pow(10, 1)) / Math.pow(10, 1)
                + " sq.units, first leg: "
                + firstLeg
                + " units, second leg: "
                + secondLeg
                + " units, color: "
                + getColor().toLowerCase();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
