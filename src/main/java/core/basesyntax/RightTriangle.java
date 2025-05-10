package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double areaCalculation() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, "
                + "firstLeg: " + firstLeg + " units "
                + ", secondLeg: " + secondLeg + " units "
                + ", color: " + getColor()
                + ", area: " + areaCalculation() + " sq. units");
    }
}
