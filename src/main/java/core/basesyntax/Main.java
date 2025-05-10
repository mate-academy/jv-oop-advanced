package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_OF_FIGURES = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(MAX_OF_FIGURES)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getInformation());
        }
    }
}
