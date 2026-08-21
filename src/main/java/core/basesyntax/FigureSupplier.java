package core.basesyntax;

public class FigureSupplier {
    Figure defaultFigure = new Circle("WHITE", 10);

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}