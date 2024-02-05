package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figureArray = new Figure[3];
        for (int i = 0; i < figureArray.length; i++) {
            if (i <= figureArray.length / 2) {
                figureArray[i] = figureSupplier.getRandomFigure();
                figureArray[i].printInfo(figureArray[i]);
            } else {
                figureArray[i] = figureSupplier.getDefaultFigure();
                figureArray[i].printInfo(figureArray[i]);
            }
        }
    }
}
