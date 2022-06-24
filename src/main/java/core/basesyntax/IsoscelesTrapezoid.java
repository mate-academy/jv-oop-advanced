package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double height;

    public IsoscelesTrapezoid(String color, double side, double secondSide, double height) {
        super(color, side, secondSide);
        this.height = height;
    }

    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq.units,"
                + " height: " + height + " units,"
                + " firstBase: " + sideOrRadius + " units,"
                + " secondBase: " + secondSide + " units,"
                + " color: " + color);
    }

    @Override
    public double getArea() {
        return (sideOrRadius + secondSide) * 0.5 * height;
    }
}
