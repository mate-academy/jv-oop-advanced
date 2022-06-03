package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;    // катет 1
    private double secondLeg;   // катет 2

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {

        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure RightTriangle, area: %.1f"
                            + " sq. units, firstLeg: %.1f"
                            +  " units, secondLeg: %.1f"
                            +  " units, color: %s",
                            + area(), firstLeg, secondLeg, color);
    }
}
