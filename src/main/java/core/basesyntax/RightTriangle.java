package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle() {
        firstLeg = random.nextDouble();
        secondLeg = random.nextDouble();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public String getData() {
        return "Figure: right triangle, area: " + area + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg + " units, color: " + color;
    }
}
