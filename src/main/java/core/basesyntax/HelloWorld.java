package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure figure = figureSupplier.getRandomFigure();

        figure.getArea();
        figure.draw();
    }

}
