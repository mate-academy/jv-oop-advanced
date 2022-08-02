package core.basesyntax;

public class Main {
    private static final int FIGURES_NUMBER = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_NUMBER];
        for (int i = 0; i < FIGURES_NUMBER; i++) {
            if (i < ((FIGURES_NUMBER / 2))) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
