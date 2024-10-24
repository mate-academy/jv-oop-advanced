package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculatedArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Right Triangle Legs: " + firstLeg + ", " + secondLeg);
    }
}
