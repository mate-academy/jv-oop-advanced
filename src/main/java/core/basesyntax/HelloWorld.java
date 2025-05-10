package core.basesyntax;

public class HelloWorld {
    private static final int COUNT_FIGURE_IN_ARRAY = 6;
    private static final int PIECE_OF_FIGURES_IN_ARRAY = 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[COUNT_FIGURE_IN_ARRAY];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i >= figures.length / PIECE_OF_FIGURES_IN_ARRAY
                    ? figureSupplier.getDefaultFigure() : figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
