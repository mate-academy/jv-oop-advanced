package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[5];
        figures[0] = figureSupplier.getDefaultFigure();
        figures[1] = figureSupplier.getRandomFigure(2);
        figures [2] = figureSupplier.getRandomFigure(3);
        figures [3] = figureSupplier.getRandomFigure(4);
        figures [4] = figureSupplier.getRandomFigure(5);

        for (Figure figure : figures) {
            figure.draw();

        }

    }

}
