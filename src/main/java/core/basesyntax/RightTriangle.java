package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String getUniqueProperties() {
        return "first leg: " + firstLeg + "units, second leg: " + secondLeg + " units";
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }
}
