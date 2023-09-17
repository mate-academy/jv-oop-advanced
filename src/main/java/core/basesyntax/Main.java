package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier, new Random());
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getFigureRandom();
        }

        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

