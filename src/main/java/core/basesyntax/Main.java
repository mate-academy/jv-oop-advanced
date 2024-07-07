package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ColorSupplier supplier = new ColorSupplier();
        double number = new Random().nextDouble(5);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[] {
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getNotRandomFigure(),
                figureSupplier.getNotRandomFigure(),
                figureSupplier.getNotRandomFigure(),
                figureSupplier.getDefaultFigure()
        };

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
