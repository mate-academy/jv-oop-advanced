package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    public static final double CONSTANT_FOR_TRIANGLE = 0.5;
    private String color;
    private int firstLeg;
    private int secondLeg;

    protected RightTriangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * (double) secondLeg * CONSTANT_FOR_TRIANGLE;
    }

    @Override
    public void printFigure() {
        System.out.printf("Figure: right triangle, area: %.1f, "
                        + "first leg: %d, second leg: %d color %s.%n",
                this.getArea(), this.firstLeg, this.secondLeg, this.color);
    }
}
