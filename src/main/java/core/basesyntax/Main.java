package core.basesyntax;

public class Main {
    static final int FIGURES_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i >= FIGURES_LENGTH / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].describe();
        }
    }
}
