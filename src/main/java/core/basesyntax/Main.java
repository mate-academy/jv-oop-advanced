package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int AMOUNT_OF_FIGURES = 6;

        Figure [] figures = new Figure[AMOUNT_OF_FIGURES];

        FigureSupplier figureSupplier = new FigureSupplier();

        for(int i = 0; i < AMOUNT_OF_FIGURES; i++){

            if (i < (AMOUNT_OF_FIGURES) / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();

        }
    }
}
