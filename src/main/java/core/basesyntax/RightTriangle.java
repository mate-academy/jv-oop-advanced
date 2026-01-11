package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        if (firstLeg < 0) {
            this.firstLeg = 0;
        } else {
            this.firstLeg = firstLeg;
        }
        if (secondLeg < 0) {
            this.secondLeg = 0;
        } else {
            this.secondLeg = secondLeg;
        }
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String getFigureName() {
        return "triangle";
    }

    @Override
    public String getDetails() {
        return "firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units";
    }
}
