package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figureSupplier.getRandomFigure().printInfo();
            } else {
                figureSupplier.getDefaultFigure().printInfo();
            }
        }

    }
}
