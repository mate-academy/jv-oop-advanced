package core.basesyntax;

import java.util.Random;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static int randomFigure = new Random().nextInt(10);

    public static void main(String[] args) {
        Figure[] figures = new Figure[randomFigure];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }

        figureSupplier.getDefaultFigure().draw();
    }
}
