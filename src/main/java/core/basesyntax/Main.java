package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier(random), random);

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figur:figures) {
            figur.draw();
        }
    }
}
