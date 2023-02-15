package core.basesyntax;

import java.util.Random;

public class Main {
    private static int BOUND = 100;
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();

    public static void main(String[] args) {
        Figure[] figureArray = new Figure[6];
        for (int i = 0; i < figureArray.length; i++) {
            if (i < 3) {
                figureArray[i] = figureSupplier.getRandomFigure();
            } else {
                figureArray[i] = figureSupplier.getDefaultFigure();
            }
            figureArray[i].draw();
        }
    }
}
