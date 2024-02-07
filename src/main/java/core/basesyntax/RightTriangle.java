package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        if (firstLeg > 0 && secondLeg > 0) {
            this.firstLeg = firstLeg;
            this.secondLeg = secondLeg;
        }
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rightTriangle, area " + getArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }
}
