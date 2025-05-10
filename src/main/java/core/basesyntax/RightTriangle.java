package core.basesyntax;

public class RightTriangle extends FigureAbstract implements Figure {
    private double firstLeg;
    private double secondLeg;
    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + ", first leg: " + firstLeg + ", second leg: " + secondLeg + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
