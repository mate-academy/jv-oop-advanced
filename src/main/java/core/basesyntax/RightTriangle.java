package core.basesyntax;

public class RightTriangle implements Figure {
    private double baseTriangle;
    private double heightTriangle;

    public RightTriangle(int baseTriangle, int heightTriangle) {
        this.baseTriangle = baseTriangle;
        this.heightTriangle = heightTriangle;
    }

    @Override
    public double getArea() {
        return baseTriangle * heightTriangle / 2;
    }
}
