package core.basesyntax;

import core.basesyntax.model.Figure;
import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[random.nextInt(10)];
        for (int i = 0; i < figure.length; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].setColour(colorSupplier.getRandomColour());
            figure[i].draw();
        }

    }
}

