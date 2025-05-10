package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Drawable[] figures = new Drawable[6];
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        for (int i = 0; i < 5; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 5; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}
