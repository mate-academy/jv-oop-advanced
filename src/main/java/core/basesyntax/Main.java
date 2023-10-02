package core.basesyntax;

public class Main {
    static final int NUMBER_OF_ALL_FIGURES = 6;
    static final int NUMBER_OF_RANDFIGURE = 3;
    static final int NUMBER_OF_DEFFIGURE = 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_ALL_FIGURES];
        for (int i = 0; i < NUMBER_OF_ALL_FIGURES; i++) {
            if (i < NUMBER_OF_RANDFIGURE) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            if (i > NUMBER_OF_DEFFIGURE) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }

    }
}

