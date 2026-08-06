package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double obtaining() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: RightTriangle , area: " + obtaining()
                + " sq. units,  firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }
}
