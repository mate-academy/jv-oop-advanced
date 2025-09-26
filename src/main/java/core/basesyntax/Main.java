package core.basesyntax;

public class Main {
    private static final int MAX_FIGURES_ARRAY = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] agr) {
        Figure[] figures = new Figure[MAX_FIGURES_ARRAY];

        for (int i = 0; i < MAX_FIGURES_ARRAY / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = MAX_FIGURES_ARRAY / 2; i < MAX_FIGURES_ARRAY; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure allFigures : figures) {
            allFigures.draw();
        }
    }
}
