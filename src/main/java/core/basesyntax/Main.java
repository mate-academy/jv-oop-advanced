package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        final Figure defaultFigure = figureSupplier.getDefaultFigure();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                continue;
            }
            figures[i] = defaultFigure;
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
