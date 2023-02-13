package core.basesyntax;

public class Main {
    public static final int AMOUNT_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[AMOUNT_OF_FIGURES];

        for (int i = 0; i < AMOUNT_OF_FIGURES / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = AMOUNT_OF_FIGURES / 2; i < AMOUNT_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
