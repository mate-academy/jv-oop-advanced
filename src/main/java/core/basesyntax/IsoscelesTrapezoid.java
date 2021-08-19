package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int sideA;
    private final int sideB;
    private final int high;

    public IsoscelesTrapezoid(String color, String figure, int sideA, int sideB, int high) {
        super(color, figure);
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2.0 * high;
    }

    @Override
    public String draw() {
        return "Figure " + getType() + ", area " + getArea() + " sq.u, sideA "
                    + sideA + ", sideA " + sideB + " and high " + high + " u., color " + getColor();
    }
}
