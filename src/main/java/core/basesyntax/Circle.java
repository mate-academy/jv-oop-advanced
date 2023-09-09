package core.basesyntax;

public class Circle implements AreaCalculator, FigurePrinter {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double obtainArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printFigure() {
        System.out.println();
    }
}
