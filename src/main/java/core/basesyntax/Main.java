package core.basesyntax;

public class Main {
    private static final int FIGURES_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_LENGTH];
        for (int i = 0; i < FIGURES_LENGTH; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            if (i < FIGURES_LENGTH / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i].draw());
        }
    }
}
