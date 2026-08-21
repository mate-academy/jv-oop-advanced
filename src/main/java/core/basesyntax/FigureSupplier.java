package core.basesyntax;

public class FigureSupplier {
    private Figure defaultFigure = new Circle("WHITE", 10);

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}