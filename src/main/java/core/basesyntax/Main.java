package core.basesyntax;

public class Main {
    private static final int FIGURE_ARRAY_SIZE = 6;
    private static final int FIXED_CIRCLE_COUNT = 3;
    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i <= FIXED_CIRCLE_COUNT - 1) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].drawTheFigure();
        }
    }
}
