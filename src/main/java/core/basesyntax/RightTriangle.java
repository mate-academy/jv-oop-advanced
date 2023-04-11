package core.basesyntax;

public class RightTriangle implements Figure{
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double gerArea() {
        return sideA * sideB / 2;
    }


}
