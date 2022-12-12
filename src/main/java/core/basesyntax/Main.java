package core.basesyntax;

public class Main {
    private static final int FIGURE_ARRAY_SIZE = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] Figures = new Figure[FIGURE_ARRAY_SIZE];
        for (int i = 0; i < Figures.length; i++) {
            Figures[i] = i < Figures.length / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            Figures[i].drawTheFigure();
        }
    }
}
