package core.basesyntax;

public class RightTriangle extends Figure {
    private double fistLeg;
    private double secondLeg;

    public RightTriangle(String color, double fistLeg, double secondLeg) {
        super(color);
        this.fistLeg = fistLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * fistLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure RightTriangle, area: " + getArea() + ", firstLeg "
                + fistLeg + ", secondLeg " + secondLeg + " color " + color);
    }
}
