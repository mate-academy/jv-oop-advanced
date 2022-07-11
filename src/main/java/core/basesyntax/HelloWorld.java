package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure[] figureArray = new Figure[6];
        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = i < 3 ? fs.getRandomFigure() : fs.getDefaultFigure();
            figureArray[i].draw();
        }
    }
}
