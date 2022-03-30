package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        return new Figure().draw(new Figure().getFigureType());
    }

    public Figure getDefaultFigure() {
        return new Figure().drawDefault();
    }
}
