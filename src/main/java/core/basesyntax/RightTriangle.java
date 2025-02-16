package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea()
                + "sq. units, firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg + ", color: "
                + getColor() + ".");
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }
}
