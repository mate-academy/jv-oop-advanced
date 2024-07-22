package core.basesyntax;

public class Main {
    private static final int FIGURE_AREA_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_AREA_SIZE];
        int midPoint = FIGURE_AREA_SIZE / 2;

        for (int i = 0; i < figures.length; i++) {
            if (i < midPoint) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }

        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
