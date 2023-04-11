package core.basesyntax;

public class RightTriangle implements Figure {
    private double sideA;
    private double sideB;

    public RightTriangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double gerArea() {
        return sideA * sideB / 2;
    }
}
