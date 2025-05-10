package core.basesyntax;

public class Main {
    public static final int FIGURES_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_COUNT; i++) {
            if (i < FIGURES_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i]);
        }
    }
}
