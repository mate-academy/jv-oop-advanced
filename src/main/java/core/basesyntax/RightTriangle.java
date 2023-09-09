package core.basesyntax;

public class RightTriangle implements AreaCalculator, FigurePrinter {
    private int hypotenuse;
    private int height;
    private int base;

    public RightTriangle(int hypotenuse, int height, int base ) {
        this.hypotenuse = hypotenuse;
        this.height = height;
        this.base = base;
    }

    @Override
    public double obtainArea() {
        return (base * height) / 2;
    }

    @Override
    public void printFigure() {
        System.out.println();
    }
}
