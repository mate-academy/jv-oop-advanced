package core.basesyntax;

public class Main {
    private static final int FIGURE_INDEX = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_INDEX];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                continue;
            }
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
