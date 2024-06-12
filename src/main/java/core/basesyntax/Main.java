package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

        Figure[] figures = new Figure[10];
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            if (figure != null) {
                figure.draw();
            }
        }
    }
}
