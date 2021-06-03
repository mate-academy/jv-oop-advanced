package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

import java.util.Random;

public class Main{
    public static final int sizeArray = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[sizeArray];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
