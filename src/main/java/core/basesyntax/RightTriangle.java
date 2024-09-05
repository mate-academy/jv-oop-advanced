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
    public double calculateArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: "
                + decimalFormat.format(calculateArea()) + " sq. units, first leg: "
                + decimalFormat.format(firstLeg) + " units, second leg: "
                + decimalFormat.format(secondLeg) + " units, color: " + color);
    }
}
