package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.random.FigureSupplier;

public class MainApp {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int randomNumberOfFigures = figureSupplier.getRandomValue(FigureSupplier.MAX_VALUE);
        Figure[] randomFigures = new Figure[randomNumberOfFigures];
        for (Figure figure : randomFigures) {
            figure = figureSupplier.getRandomFigure();
            figure.toDraw();
        }
    }
}
