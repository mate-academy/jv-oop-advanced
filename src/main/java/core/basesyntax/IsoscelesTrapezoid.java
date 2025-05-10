package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseUp;
    private double baseDown;
    private double leg;

    public IsoscelesTrapezoid(double baseUp, double baseDown, double leg, String color) {
        super(color);
        this.baseUp = baseUp;
        this.baseDown = baseDown;
        this.leg = leg;
    }

    public double getBaseUp() {
        return baseUp;
    }

    public void setBaseUp(double baseUp) {
        this.baseUp = baseUp;
    }

    public double getBaseDown() {
        return baseDown;
    }

    public void setBaseDown(double baseDown) {
        this.baseDown = baseDown;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area: "
                + ((int) (getArea() * 100) / 100.0) + " sq. units, base1: " + getBaseUp()
                + ", base2: " + getBaseDown()
                + ", leg: " + getLeg()
                + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        double partOfBase = Math.abs(baseUp - baseDown) / 2.0;
        double height = Math.sqrt(Math.pow(leg, 2) - Math.pow(partOfBase,2));
        double resultArea = ((baseUp + baseDown) / 2) * height;
        return resultArea;
    }
}
