package core.basesyntax;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
