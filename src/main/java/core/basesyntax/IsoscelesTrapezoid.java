package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseBottom;
    private double baseUp;
    private double side;

    public IsoscelesTrapezoid(double baseBottom, double baseUp, double side) {
        this.baseBottom = baseBottom;
        this.baseUp = baseUp;
        this.side = side;
    }

    public double getBaseBottom() {
        return baseBottom;
    }

    public void setBaseBottom(double baseBottom) {
        this.baseBottom = baseBottom;
    }

    public double getBaseUp() {
        return baseUp;
    }

    public void setBaseUp(double baseUp) {
        this.baseUp = baseUp;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double s = (baseUp + baseBottom + 2 * side) / 2;
        return Math.sqrt((s - baseUp) * (s - baseBottom) * (s - side) * (s - side));
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid, area: " + getArea() + " sq.units, side: " + side
                + " units, up base: " + baseUp + "units, bottom base:" + baseBottom
                + "units, color: " + getColor());
    }
}
