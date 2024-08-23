package core.basesyntax;

public class Rectangle implements Figure {
    private int firstSide;
    private int secondSide;

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
