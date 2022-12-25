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
    public double getArea() {
        return ((firstLeg * secondLeg) / 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + this.getArea()
            + " sq. units, first leg: " + firstLeg
            + " units, second leg: " + secondLeg + " color: " + getColor());
    }
}
