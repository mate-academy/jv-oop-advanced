package core.basesyntax;

public class RightTriangle extends Figure {
    int firstLeg;
    int secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.color = color;
    }

    @Override
    public double ObtainArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void DrawArea() {
        System.out.println("Figure: rightTriangle, area: " + ObtainArea() + " sq. units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}
