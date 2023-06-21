package core.basesyntax;

public class Figure {
    protected String color;
    protected double area;
    private final FigureSupplier figureSupplier = new FigureSupplier();

    public Figure getRandomFigure() {
        return figureSupplier.getRandomFigure();
    }

    public Figure getDefaultFigure() {
        return figureSupplier.getDefaultFigure();
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "color='" + color + '\'' +
                ", area=" + area +
                ", figureSupplier=" + figureSupplier +
                '}';
    }
}
