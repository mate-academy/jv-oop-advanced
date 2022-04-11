package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static Random random = new Random();

    public static Random getRandom() {
        return random;
    }

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[6];

        for (int i = 0; i <= 5; i++) {
            if (i < 3) {
                figureArray[i] = figureSupplier.getRandomFigure();
            } else {
                figureArray[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figureArray) {
            figure.draw();
        }
    }

}
