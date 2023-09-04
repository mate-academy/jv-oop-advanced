package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        int sizeOfArray = 6;
        Figure[] figureArray = new Figure[sizeOfArray];
        for (int i = 0; i < (sizeOfArray / 2); ++i) {
            figureArray[i] = fs.getRandomFigure();
        }
        for (int i = (sizeOfArray / 2); i < sizeOfArray; ++i) {
            figureArray[i] = fs.getDefaultFigure();
        }
        for (int i = 0; i < sizeOfArray; ++i) {
            figureArray[i].draw();
        }
    }
}
