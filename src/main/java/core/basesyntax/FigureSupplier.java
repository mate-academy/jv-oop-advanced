package core.basesyntax;

public interface FigureSupplier {
    default Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }

    Figure getRandomFigure();
}
