package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[6];
        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = i < figureArray.length / 2
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            figureArray[i].draw();
        }
    }
}
