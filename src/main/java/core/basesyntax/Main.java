package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].toDraw();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].toDraw();
        }
    }
}
