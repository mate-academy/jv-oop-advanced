package core.basesyntax;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random figure = new Random();
        final int num = figure.nextInt(5) + 1;

        for (int i = 0; i < num; i++) {
            Figure randomFigure = figureSupplier.getRandomFigure();
            System.out.println(randomFigure.draw());
        }
    }
}
