package core.basesyntax;

public class Main {
    public static final int NUMBER_OF_FIGURES = 6;

    public static void main(String [] args) {
        Figure [] figures = new Figure[NUMBER_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUMBER_OF_FIGURES / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = NUMBER_OF_FIGURES / 2; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            figures[i].draw();
        }
    }

}
