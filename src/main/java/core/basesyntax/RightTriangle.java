package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area:" + getArea() + " sq. units, firstLeg: "
                + firstLeg + ", sq. units, secondLeg: "
                + secondLeg + " units, color: "
                + getSupplier().getRandomColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }
}
