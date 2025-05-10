package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getHypotenuse() {
        return Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg);
    }

    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + String.format("%.2f", getArea())
                + " sq.units, first leg:" + String.format("%.2f", firstLeg)
                + ", second leg" + String.format("%.2f", secondLeg) + " hypotenuse: "
                + String.format("%.2f", getHypotenuse()) + " units, color:" + getColor());
    }
}
