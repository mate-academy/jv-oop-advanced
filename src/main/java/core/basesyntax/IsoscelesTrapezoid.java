package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double base;
    private double height;

    public IsoscelesTrapezoid(double side, double base, double height) {
        this.side = side;
        this. base = base;
        this. height = height;
    }

    @Override
    public double getArea() {
        return (side + base) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %s sq. units, side: %s units, base: %s units, "
                        + "height: %s units, color: %s%n", "IsoscelesTrapezoid",
                        this.getArea(), this.side, this.base, this.height, this.getColor());
    }
}
