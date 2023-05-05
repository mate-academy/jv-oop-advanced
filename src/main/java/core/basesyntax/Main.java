package core.basesyntax;

public class Main {
    public static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_COUNT];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.createDefaultFigure();

            }
            figures[i].draw();
        }
    }
}
