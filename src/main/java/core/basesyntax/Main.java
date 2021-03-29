package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[10];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.drawFigure());
        }

        Figure firstFigure = FigureSupplier.getRandomFigure();
        Figure secondFigure = FigureSupplier.getRandomFigure();
        System.out.println(firstFigure.drawFigure());
        System.out.println(secondFigure.drawFigure());
    }
}
