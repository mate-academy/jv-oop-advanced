package core.basesyntax;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10);
    }
}
