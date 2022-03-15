package core.basesyntax;

import core.basesyntax.model.Figures;

public class Application {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figures[] figures = new Figures[3];
        for (int i = 0; i < figures.length - 1; i++) {
            figures[i] = figureSupplier.getRandomFigures();
        }
        figures[2] = figureSupplier.getDefaultFigure();
        for (Figures figures1 : figures) {
            figures1.draw();
        }
    }
}
