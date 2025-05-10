package core.basesyntax;

public class Main {
    private static final int COUNT_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[COUNT_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < COUNT_OF_FIGURES / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = COUNT_OF_FIGURES / 2; i < COUNT_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
