package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, Figure first leg, second leg: "
                + firstLeg
                + ", "
                + secondLeg
                + ", Area: "
                + getArea()
                + ", Color: "
                + getColor());
    }
}
