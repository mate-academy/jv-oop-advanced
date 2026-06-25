package core.basesyntax;

public class HelloWorld {
    private static final int FIGURES_LIMIT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_LIMIT];

        for (int i = 0; i < figures.length; i++) {
            if (i < FIGURES_LIMIT / 2) {
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
