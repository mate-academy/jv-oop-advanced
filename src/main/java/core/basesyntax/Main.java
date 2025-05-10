package core.basesyntax;

public class Main {
    static final int MAX_FIGURES_LENGTH = 6;
    static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure []figures = new Figure[MAX_FIGURES_LENGTH];
        for (int i = 0; i < MAX_FIGURES_LENGTH / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = MAX_FIGURES_LENGTH / 2; i < MAX_FIGURES_LENGTH; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
