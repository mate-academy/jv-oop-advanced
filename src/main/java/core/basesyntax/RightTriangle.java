package core.basesyntax;

public class RightTriangle implements Figure{
    private int longSide;
    private int shortSide;

    public RightTriangle(int longSide, int shortSide) {
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return longSide * shortSide / 2;
    }
}
