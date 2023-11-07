package core.basesyntax;

public class RightTriangle extends ColoredFigure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }
}
