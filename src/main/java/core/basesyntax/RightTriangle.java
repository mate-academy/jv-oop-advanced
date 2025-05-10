package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    @Override
    public double getArea() {
        return (this.firstLeg * this.secondLeg) / 2;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        if (firstLeg > 0) {
            this.firstLeg = firstLeg;
        }
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        if (secondLeg > 0) {
            this.secondLeg = secondLeg;
        }
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: triangle, area: " + this.getArea() + " sq. units, firstLeg: "
                + this.firstLeg + " units, secondLeg: " + this.secondLeg
                + " units, color: " + this.getColor());

    }
}
