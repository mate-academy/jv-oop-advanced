package core.basesyntax;

public class RightTriangle extends Figure {
    private double legTriangle1;
    private double legTriangle2;

    public RightTriangle(double firstLeg, double secondLeg,
                         Color color) {
        super(color);
        this.legTriangle1 = firstLeg;
        this.legTriangle2 = secondLeg;
    }

    @Override
    public double getArea() {
        return (legTriangle1 * legTriangle2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, firstLeg: " + legTriangle1 + ", secondLeg: "
                + legTriangle2 + " units, color: " + color.name());
    }
}
