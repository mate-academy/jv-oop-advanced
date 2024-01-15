package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: RightTriangle, area: "
                + calculateArea() + " sq. units,  firstLeg: "
                + firstLeg + ", secondLeg:" + secondLeg
                + ", color: " + getColor());
    }
}
