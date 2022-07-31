package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double up;
    private final double down;
    private final double sameSides;

    public IsoscelesTrapezoid(String color, double up, double down, double sameSides) {
        super(color);
        this.up = up;
        this.down = down;
        this.sameSides = sameSides;
    }

    public double getUp() {
        return up;
    }

    public void setUp(double up) {
        this.up = up;
    }

    public double getDown() {
        return down;
    }

    public double getSameSides() {
        return sameSides;
    }

    @Override
    public double getArea() {
        return up * down * sameSides;
    }

    @Override
    public void drawing() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea()
                + ", firstSide: " + getUp() + ", secondSide: " + getDown()
                + ", sameSides: " + getSameSides() + ", color: " + getColor());
    }
}
