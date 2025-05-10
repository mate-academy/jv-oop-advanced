package core.basesyntax;

public class MainApp {
    private static final byte NUMBER_FIGURE = 6;

    public static void main(String[] args) {
        Figure[] arrayFigure = new Figure[NUMBER_FIGURE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < arrayFigure.length; i++) {
            if (i < NUMBER_FIGURE / 2) {
                arrayFigure[i] = figureSupplier.getRandomFigure();
            } else {
                arrayFigure[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure oneFigure : arrayFigure) {
            oneFigure.draw();
        }

    }
}
