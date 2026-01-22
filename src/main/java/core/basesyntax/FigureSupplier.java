package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
