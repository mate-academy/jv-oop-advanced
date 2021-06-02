package core.basesyntax;

import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        int figureAmount = randomNumber.nextInt(5);
        Figure[] figures = new Figure[figureAmount];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }

    }

}
