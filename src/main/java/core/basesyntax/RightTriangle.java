package core.basesyntax;

public class RightTriangle implements Figure {
    private int firstLeg;
    private int secondLeg;
    private Color color;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        this.color = color;
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
