package core.basesyntax;

public class RightTriangle extends Figure {
    private final double secondLeg;
    private final double firstLeg;

    public RightTriangle(Color color, double secondLeg, double firstLeg) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double area() {
        return 0.5 * this.secondLeg * this.firstLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + String.format("%.2f", area())
                + " sq.units, first leg: "
                + firstLeg
                + " units, second leg: "
                + secondLeg
                + " color: "
                + getColor().name());
    }
}
