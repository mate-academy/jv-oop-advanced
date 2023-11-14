package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double baseUp;
    private double baseDown;
    private double height;

    public IsoscelesTrapezoid(double baseUp, double baseDown, double height) {
        this.baseUp = baseUp;
        this.baseDown = baseDown;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (this.baseUp + this.baseDown) * this.height;
    }

    @Override
    public void printInfoFigure() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea() + "sq.units,"
                + " baseUp: " + getBaseUp() + " units,"
                + " baseDown: " + getBaseDown() + " units,"
                + " color: " + getColor());
    }
}
