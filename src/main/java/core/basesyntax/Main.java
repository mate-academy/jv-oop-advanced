package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();

        //generating the random-sized array of the random figures
        Figure[] figures = new Figure[1 + random.nextInt(30)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        //displaying the entire list of figures
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
