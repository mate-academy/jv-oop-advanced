package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier, new Random());
        Drawable[] figures = new Drawable[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getFigureRandom();
        }

        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}

