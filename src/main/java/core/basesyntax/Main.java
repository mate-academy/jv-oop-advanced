package core.basesyntax;

public class Main {
    private static final int TOTAL_FIGURES = 6;
    private static final int RANDOM_FIGURES_COUNT = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = createFiguresArray(figureSupplier, TOTAL_FIGURES, RANDOM_FIGURES_COUNT);
        drawFigures(figures);
    }

    private static Figure[] createFiguresArray(FigureSupplier figureSupplier,
                                               int totalFigures, int randomFiguresCount) {
        Figure[] figures = new Figure[totalFigures];
        for (int i = 0; i < figures.length; i++) {
            if (i < randomFiguresCount) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        return figures;
    }

    private static void drawFigures(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
