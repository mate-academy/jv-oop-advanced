package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        final int FigureAmount = 6;
        Figure [] figures = new Figure[FigureAmount];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FigureAmount / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = FigureAmount / 2; i < FigureAmount; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
