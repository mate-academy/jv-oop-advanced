package core.basesyntax;

public class Main {
    private static final int ARRAY_OF_FIGURES_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[ARRAY_OF_FIGURES_SIZE];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2)
                    ? figureSupplier.getFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
