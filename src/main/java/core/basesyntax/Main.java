package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSupplier figureSupply = new FigureSupplier();
        for (int i = 0; i < FIGURE_COUNT; i++) {
            figures[i] = i < FIGURE_COUNT / 2
                    ? figureSupply.generateRandomFigure()
                    : figureSupply.getDefaultFigure();
            figures[i].draw();
        }
    }
}
