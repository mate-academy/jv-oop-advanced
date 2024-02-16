package core.basesyntax;

public class RightTriangle extends ColorsOfFigures {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + ", color: " + getColor());
    }
}
