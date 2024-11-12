package core.basesyntax;

public class RightTriangle extends Figure implements GetFigureArea {
    private double firstLeg;
    private double secondLeg;

    @Override
    public String toString() {
        return "Figure - RightTriangle: firstLeg " + this.firstLeg
                + " ,secondLeg " + this.secondLeg
                + " ,area " + this.getArea() + " color "
                + this.color;
    }

    @Override
    public double getArea() {
        return  firstLeg * secondLeg / 2;
    }
    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
}
