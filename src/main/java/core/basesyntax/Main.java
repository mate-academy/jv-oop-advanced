package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final Random random = new Random();
        Figure[] figures = new Figure[10];
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier(random), random);
        for (int i = 0; i < 5; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 5; i < 10; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
