package core.basesyntax;

public class RightTriangle implements Figure {
    public double baseTriangle;
    public double heightTriangle;

    public RightTriangle(int baseTriangle, int heightTriangle) {
        this.baseTriangle = baseTriangle;
        this.heightTriangle = heightTriangle;
    }

    @Override
    public double getArea() {
        return baseTriangle * heightTriangle / 2;
    }
}
