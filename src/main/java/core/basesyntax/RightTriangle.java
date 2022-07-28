package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
        setArea(calculateArea());
    }

    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void getPrintInfo() {
        System.out.println("Figure: RightTriangle, area: "
                + getArea() + " sq. units,  firstLeg: "
                + firstLeg + ", secondLeg:" + secondLeg
                + ", color: " + getColor());
    }
}
