package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.FigureSupplier;

import java.util.Random;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];

        for (int i = 0, j = figures.length / 2; i < figures.length && j < figures.length / 2; i++, j++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[j] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < ; i++) {
            
        }
    }
}