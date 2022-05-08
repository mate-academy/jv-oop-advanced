package core.basesyntax;

public class Main {
    private static final int FIGURES_LENGHT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_LENGHT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_LENGHT; i++) {
            if (i < FIGURES_LENGHT / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
