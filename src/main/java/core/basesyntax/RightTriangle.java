package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        super.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle area = " + getArea() + ", color: "
                + color.name() + ", firstLeg: " + firstLeg + ", secondLeg: " + secondLeg);
    }
}
