package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random numOfFigures = new Random();

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[numOfFigures.nextInt(20) + 3];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int j = 0; j < figures.length; j++) {
            figures[j].drawFigure();
        }
    }
}
