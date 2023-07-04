package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + findArea()
                + " sq.units, first leg: " + this.firstLeg
                + " units, second leg: " + this.secondLeg
                + " units, color: " + getColor());
    }

    @Override
    public double findArea() {
        return firstLeg * secondLeg / 2;
    }
}
