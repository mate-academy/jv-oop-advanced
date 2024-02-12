package core.basesyntax.model;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: "
                + getArea()
                + " sq. units, firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, color: "
                + getColor());
    }
}
