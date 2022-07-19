package core.basesyntax.main;

import core.basesyntax.figures.Figure;
import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final Random random = new Random();

    public static void main(String[] args) {
        FigureSupplier figureSupplier1 = new FigureSupplier();
        System.out.println(figureSupplier1.getDefaultFigure());

        Figure[] figures = new Figure[random.nextInt(10)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
