package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

        FigureClass[] figures = new FigureClass[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (FigureClass figure : figures) {
            System.out.println(figure.getInfo());
        }
    }
}
