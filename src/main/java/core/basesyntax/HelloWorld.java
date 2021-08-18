package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figureS = new Figure[new Random().nextInt(100)];
        for (int i = 0; i < figureS.length; i++) {
            figureS[i] = new FigureSupplier().getRandomFigure();
            figureS[i].draw();
        }

    }

}
