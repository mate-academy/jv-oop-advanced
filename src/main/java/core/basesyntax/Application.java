package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = (i < (figures.length / 2)) ? figureSupplier.getRandomFigure()
                   : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
