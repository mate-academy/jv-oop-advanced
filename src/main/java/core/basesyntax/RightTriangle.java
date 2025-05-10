package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: right triangle, area: " + obtainTheArea() + ", color: "
                + getColor() + ", first leg: "
                + firstLeg + ", second leg: " + secondLeg);
    }

    @Override
    public double obtainTheArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
