package core.basesyntax;

public class Application {
    private static final int START = 0;
    private static final int FIGURES_LENGTH = 6;
    private static final int DEFAULT_POINT = 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_LENGTH];
        for (int i = START; i < FIGURES_LENGTH; i++) {
            if (i <= DEFAULT_POINT) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
