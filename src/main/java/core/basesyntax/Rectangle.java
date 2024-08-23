package core.basesyntax;

public class Rectangle implements Figure {
    private String color;
    private int firstSide;
    private int secondSide;

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
