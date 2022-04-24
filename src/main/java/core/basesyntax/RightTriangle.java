package core.basesyntax;

public class RightTriangle extends Figure implements figureArea {
    private int firstLeg;
    private int secondLeg;
    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    @Override
    public double getFigureArea() {
        return firstLeg * secondLeg / 2;
    }
    @Override
    public String getFigureInfo() {
        return "right triangle, area: " + getFigureArea() +
                " sq.units, firstLeg: " + firstLeg + " units, secondLeg: " +
                secondLeg + " units, color: " + super.color;
    }
}
