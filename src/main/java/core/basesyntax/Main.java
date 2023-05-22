package core.basesyntax;

public class Main {
    public static final int FIGURES_NUMBER = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_NUMBER];
        for (int i = 0; i < FIGURES_NUMBER; i++) {
            if (i < FIGURES_NUMBER / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure:figures) {
            figure.printFigure();
        }
    }
}
