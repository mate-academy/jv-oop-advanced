package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;
    private static final int DIVISOR = 2;
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_COUNT];

        for (int i = 0; i < figures.length / DIVISOR; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / DIVISOR; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
