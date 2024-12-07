package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double ROUNDING_SCALE = 10.0;
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(Color color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstLeg + secondLeg) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.ISOSCELES_TRAPEZOID.name()
                + ", area: " + Math.round(getArea() * ROUNDING_SCALE) / ROUNDING_SCALE
                + " sq. units, " + "firstLeg: " + Math.round(firstLeg * ROUNDING_SCALE)
                / ROUNDING_SCALE + " units, " + "secondLeg: " + Math.round(secondLeg
                * ROUNDING_SCALE) / ROUNDING_SCALE + " units, " + "height: "
                + Math.round(height * ROUNDING_SCALE) / ROUNDING_SCALE + " units, "
                + "color: " + getColor().name() + ".");
    }
}
