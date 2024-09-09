package core.basesyntax;

import service.FigureSupplier;

public class Application {
    private static final int LOOP_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < LOOP_SIZE / 2; i++) {
            figureSupplier.getRandomFigure().draw();
        }
        for (int i = LOOP_SIZE / 2; i < LOOP_SIZE; i++) {
            figureSupplier.getDefaultFigure().draw();
        }
    }
}
