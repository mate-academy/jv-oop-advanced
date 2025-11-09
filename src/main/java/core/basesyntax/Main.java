package core.basesyntax;

public class Main {
    public static final int AMOUNT_OF_FIGURERS = 6;

    public static void main(String[] args) {
        Figure[] randomFigures = new Figure[AMOUNT_OF_FIGURERS];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < AMOUNT_OF_FIGURERS; i++) {
            if (i < AMOUNT_OF_FIGURERS / 2) {
                randomFigures[i] = figureSupplier.getRandomFigure();
            } else {
                randomFigures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: randomFigures) {
            figure.draw();
        }
    }
}
