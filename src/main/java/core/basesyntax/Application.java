package core.basesyntax;

public class Application {
    public static final int FIGURES_LENGTH = 6;

    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_LENGTH];

        for (int i = 0; i < FIGURES_LENGTH; i++) {
            if (i < FIGURES_LENGTH / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }

            figures[i].draw();
        }
    }
}
