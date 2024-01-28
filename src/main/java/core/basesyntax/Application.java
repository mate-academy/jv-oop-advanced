package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_FIGURES = 12;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        boolean isHalfDone = false;

        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            isHalfDone = i >= NUMBER_OF_FIGURES / 2;

            if (!isHalfDone) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }

            figures[i].draw();
        }

    }
}
