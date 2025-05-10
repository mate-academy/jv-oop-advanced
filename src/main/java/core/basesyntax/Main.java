package core.basesyntax;

public class Main {
    public static final int FIGURE_COUNTER = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[FIGURE_COUNTER];

        for (int i = 0; i < FIGURE_COUNTER; i++) {
            if (i < FIGURE_COUNTER / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.calculateArea();
            figure.draw();
        }
    }
}
