package core.basesyntax;

public class Main {
    private static final int FIGURE_ARRAY_SIZE = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_ARRAY_SIZE];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].drawTheFigure();
        }
    }
}
