package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.format("Figure: right triangle, color: %s, area = %.2f, "
                + "(firstLeg = %.2f, secondLeg = %.2f)\n",
                getColor(), getArea(), firstLeg, secondLeg);
    }
}
