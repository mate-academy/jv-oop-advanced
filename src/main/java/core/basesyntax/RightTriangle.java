package core.basesyntax;

public class RightTriangle extends FigureForm {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return Math.round(firstLeg * secondLeg * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + Figure.RightTriangle + ", area: " + getArea()
                + " sq.units, " + "side1: " + firstLeg + " units, " + "side2: "
                + secondLeg + " units, " + "color: " + getColor());
    }
}
