package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureStandart = new FigureSupplier(random, colorSupplier);
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            figures[i] = (i < 3) ? figureStandart.getRandomFigure()
                    : figureStandart.getDefaultFigure();
        }
        for (int i = 0; i < 6; i++) {
            figures[i].draw();
        }

    }
}
