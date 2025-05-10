package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        for (int i = 0; i < 6; i += 2) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i + 1] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            System.out.println(figure.drawFigure());
        }
    }
}
