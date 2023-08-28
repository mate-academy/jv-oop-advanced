package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int UPPER_BOUND = 20;

    public static void main(String[] args) {
        Figure[] figures = getFigures();
        for (Figure figure : figures) {
            figure.draw();
        }
    }

    private static Figure[] getFigures() {
        Figure[] figures = new Figure[new Random().nextInt(UPPER_BOUND)];
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier());
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        return figures;
    }
}
