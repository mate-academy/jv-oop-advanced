package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
    }

    @Override
    public double getFigureArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String getFigureInfo() {
        return "right triangle, area: " + getFigureArea() 
            + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: "
            + secondLeg + " units, color: " + super.getColor();
    }
}
