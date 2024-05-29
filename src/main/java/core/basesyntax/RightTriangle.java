package core.basesyntax;

public class RightTriangle extends FigureBase {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle [color=" + color + ", firstLeg="
                + firstLeg + ", secondLeg=" + secondLeg + "]");
    }
}
