package core.basesyntax;

public class Main {
    private static final int AMOUNT_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[AMOUNT_OF_FIGURES];

        for (int i = 0; i < AMOUNT_OF_FIGURES; i++) {
            if (i < (AMOUNT_OF_FIGURES / 2)) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}

