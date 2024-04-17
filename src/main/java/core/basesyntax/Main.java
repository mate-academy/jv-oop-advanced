package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static final int FIGURES_AMOUNT = 7;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_AMOUNT];
        figures[0] = figureSupplier.getRectangle();
        figures[1] = figureSupplier.getCircle();
        figures[2] = figureSupplier.getSquare();
        figures[3] = figureSupplier.getRightTriangle();
        figures[4] = figureSupplier.getRectangle();
        figures[5] = figureSupplier.getIsoscelesTrapezoid();
        figures[6] = figureSupplier.getRandomFigure();

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
