package core.basesyntax;

public class RightTriangle extends Figure {
    int firstLeg;
    int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color, (double) (firstLeg * secondLeg) / 2, "RightTriangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String getFigure() {
        return "Figure: " + super.name + ", area: " + super.area + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + super.color;
    }
}
