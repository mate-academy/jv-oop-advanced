package core.basesyntax;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i].printInformation());
        }
    }
}
