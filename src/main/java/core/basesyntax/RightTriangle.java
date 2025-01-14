package core.basesyntax;

public class RightTriangle extends Figure {
    int firstLeg;
    int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.color = color;
        super.name = "RightTriangle";
        super.area = (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public String getFigure() {
        return "Figure: " + super.name + ", area: " + super.area + " sq. until, firstLeg: " + firstLeg + " until, secondLeg: " + secondLeg + " until, color: " + super.color;
    }
}
