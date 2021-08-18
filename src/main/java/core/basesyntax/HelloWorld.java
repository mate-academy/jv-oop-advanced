package core.basesyntax;

import core.basesyntax.model.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[randomNumber];
        for (int i = 0; i < randomNumber; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }

    }
}

