package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void drow() {
        System.out.println("Figure: right triangle" + ", area: " + getArea()
                         + " sq.units, first leg: " + firstLeg + " units, second leg: "
                         + secondLeg + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
