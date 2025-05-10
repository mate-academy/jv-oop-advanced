package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Application {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = {
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure()};

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
