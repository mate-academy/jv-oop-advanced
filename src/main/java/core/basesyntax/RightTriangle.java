package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg + " sq.units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
