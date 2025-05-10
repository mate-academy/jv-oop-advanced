package core.basesyntax;

public class Main {
    private static final int ALL_FIGURE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ALL_FIGURE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.drawFigure();
        }

    }
}
