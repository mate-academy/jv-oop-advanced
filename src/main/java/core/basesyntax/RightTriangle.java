package core.basesyntax;

public class RightTriangle extends FigureColor implements Figure, AreaCalculator {
    private int firstLeg;
    private int secondLeg;

    public void setRightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rightTriangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg
                + " secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }
}
