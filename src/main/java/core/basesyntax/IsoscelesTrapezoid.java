package core.basesyntax;

public class IsoscelesTrapezoid implements AreaCalculator, FigurePrinter {
    private int leg;
    private int biggestSide;
    private int smallestSide;

    @Override
    public double obtainArea() {
        return ((leg ^ 2 - (biggestSide - smallestSide) / 2) ^ 2) * (biggestSide + smallestSide) / 2;
    }

    @Override
    public void printFigure() {
        System.out.println();
    }
}
