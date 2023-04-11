package core.basesyntax;

public class IsoscelesTrapezoid implements Figure{
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double gerArea() {
        return (sideA + sideB) / 2 * height ;
    }
}
