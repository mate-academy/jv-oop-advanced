package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {

        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
