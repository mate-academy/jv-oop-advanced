package core.basesyntax;

public class Main {
    private static final int MAX_FIGURES_COUNT = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[MAX_FIGURES_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2;i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
