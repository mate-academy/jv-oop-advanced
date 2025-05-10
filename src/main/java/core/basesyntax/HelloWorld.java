package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[6];

        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            System.out.println(figure[i]);
        }
        for (int j = figure.length / 2; j < figure.length; j++) {
            figure[j] = figureSupplier.getDefaultFigure();
            System.out.println(figure[j]);
        }

    }
}
