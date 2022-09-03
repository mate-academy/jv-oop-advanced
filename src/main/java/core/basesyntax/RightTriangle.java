package core.basesyntax;

public class RightTriangle extends Figure {
    double firstLeg;
    double secondLeg;
    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
    @Override
    void drawFigure() {
        System.out.println("Figure: rightTriangle, area: " + getArea() + " sq.units, firstLeg: " + firstLeg +
                " units, secondLeg: " + secondLeg + " color: " + new ColorSupplier().getRandomColor().toLowerCase());
    }
}
