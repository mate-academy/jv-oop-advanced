package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_NUMBER_FIGURES = 10;

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int lengthArrayOfFigures = randomNumber.nextInt(MAX_NUMBER_FIGURES) + 1;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigures = new Figure[lengthArrayOfFigures];

        for (int i = 0; i < arrayOfFigures.length; i++) {
            arrayOfFigures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : arrayOfFigures) {
            System.out.println(figure.draw());
        }
    }
}
