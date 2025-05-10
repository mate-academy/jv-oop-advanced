package core.basesyntax;

public class Main {
    public static final int FIGURE_ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2 - 1) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
