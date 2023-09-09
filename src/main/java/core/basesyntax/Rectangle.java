package core.basesyntax;

public class Rectangle implements AreaCalculator, FigurePrinter {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double obtainArea() {
        return firstSide * secondSide;
    }

    @Override
    public void printFigure() {
        System.out.println();
    }
}
