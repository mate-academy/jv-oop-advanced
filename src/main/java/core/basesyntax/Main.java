package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int upperBound = 100;
        int figureAmountBound = 10;

        Random randomNumber = new Random();
        int figureAmount = randomNumber.nextInt(figureAmountBound);
        Figure[] figures = new Figure[figureAmount];

        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier(), upperBound);
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
