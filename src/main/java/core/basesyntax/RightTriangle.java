package core.basesyntax;

public class RightTriangle extends Figure {
    protected double firstLeg;
    protected double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String getParameters() {
        return "firstLeg: " + String.format("%.2f", firstLeg) + " units, "
                + "secondLeg: " + String.format("%.2f", secondLeg) + " units";
    }
}
