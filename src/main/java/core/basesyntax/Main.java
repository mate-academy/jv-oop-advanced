package core.basesyntax;

public class Main {
    private static final int RANDOM_FIGURES_QUANTITY = 5;
    private static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < RANDOM_FIGURES_QUANTITY; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        figures[5] = figureSupplier.getDefaultFigure();
        figures[6] = figureSupplier.getDefaultSquare();
        figures[7] = figureSupplier.getDefaultIsoscelesTrapezoid();
        figures[8] = figureSupplier.getDefaultRightTriangle();
        figures[9] = figureSupplier.getDefaultRectangle();
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
