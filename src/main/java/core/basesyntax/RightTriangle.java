package core.basesyntax;

public class RightTriangle extends Figures implements DrawFigure, GetArea {
    private int firstLeg, secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        double area = 0.5 * firstLeg * secondLeg;
        return area;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: RightTriangle, area:" + this.getArea() + " sq.units, firstLeg: " + this.firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + this.getColor());
    }
}
