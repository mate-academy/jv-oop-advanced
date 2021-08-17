package core.basesyntax;

public class Rectangle implements Figure {
    private int longSide;
    private int shortSide;

    public Rectangle(int longSide, int shorSide) {
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return longSide * shortSide;
    }
}
