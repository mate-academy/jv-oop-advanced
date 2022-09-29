package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setType("right triangle");
    }

    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getType() + ", area: " + getArea() + " units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }
}
