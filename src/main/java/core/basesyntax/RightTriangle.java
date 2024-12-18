package core.basesyntax;

public class RightTriangle extends Figure implements CalculateArea {
    private double firstLeg;
    private double secondLeg;

    public void setSide(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, first side: "
                + getFirstLeg() + " units, second side: " + getSecondLeg()
                + " units, color: " + getColor());
    }
}
