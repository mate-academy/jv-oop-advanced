package core.basesyntax;

public class Figure implements AreaCalculator {
    protected String color;
    protected double area;
    private final FigureSupplier figureSupplier = new FigureSupplier();

    public Figure getRandomFigure() {
        return figureSupplier.getRandomFigure();
    }

    public Figure getDefaultFigure() {
        return figureSupplier.getDefaultFigure();
    }

    @Override
    public String toString() {
        return "Figure : color=" + color + ", area=" + area;
    }

    @Override
    public double calculateArea() {
        return area;
    }
}
