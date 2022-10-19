package core.basesyntax;

public class RightTriangle extends _2SideFigure implements Squarable{
    public RightTriangle(String color, int a, int b) {
        super(color, a, b);
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(a, 2) / 2;
    }
}
