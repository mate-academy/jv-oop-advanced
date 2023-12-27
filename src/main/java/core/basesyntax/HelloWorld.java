package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = {new FigureSupplier().getRandomFigure(),
                new FigureSupplier().getRandomFigure(),
                new FigureSupplier().getRandomFigure(),
                new FigureSupplier().getDefaultFigure(),
                new FigureSupplier().getDefaultFigure(),
                new FigureSupplier().getDefaultFigure()};
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
