package main.java.core.basesyntax;

import java.util.Random;

public class Main {
    private static final int FIGURES_QUANTITY = 88;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(FIGURES_QUANTITY) + 1];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (Figure figure : figures) {
            figure = figureSupplier.getRandomFigure();
            System.out.println(figure.draw());
        }
    }
}
