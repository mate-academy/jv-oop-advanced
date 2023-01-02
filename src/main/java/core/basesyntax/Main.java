package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureList = new Figure[FIGURE_COUNT * 2];;

        for (int i = 0; i < FIGURE_COUNT; i++) {
            figureList[i] = figureSupplier.getRandomFigure();
            figureList[i + FIGURE_COUNT] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figureList) {
            figure.print();
        }
    }
}
