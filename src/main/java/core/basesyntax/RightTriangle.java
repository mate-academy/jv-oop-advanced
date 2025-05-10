package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double ROUNDING_SCALE = 10.0;

    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.RIGHT_TRIANGLE.name()
                + ", area: " + Math.round(getArea() * ROUNDING_SCALE) / ROUNDING_SCALE
                + " sq. units, "
                + "firstLeg: " + Math.round(firstLeg * ROUNDING_SCALE) / ROUNDING_SCALE
                + " units, "
                + "secondLeg: " + Math.round(secondLeg * ROUNDING_SCALE) / ROUNDING_SCALE
                + " units, "
                + "color: " + getColor().name() + ".");
    }
}
