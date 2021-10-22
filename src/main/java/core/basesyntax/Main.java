package core.basesyntax;

public class Main {
    private static final int FIGURES_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_LENGTH];
        for (int i = 0; i < FIGURES_LENGTH / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i + 3] = figureSupplier.getDefaultFigure();
            figures[i].draw();
            figures[i + 3].draw();
        }
    }
}
