package core.basesyntax;

import java.util.Random;

public class CoolFigures {
    public static void main(String[] args) {
        Random random = new Random();
        int bound = 15;
        int numberOfShapes = random.nextInt(bound);
        printFigures(drawArrayOfRandomFigures(numberOfShapes + 1));
    }

    public static Figure[] drawArrayOfRandomFigures(int n) {
        Figure[] randomFigures = new Figure[n];
        FigureSupplier newFigure = new FigureSupplier();
        for (int i = 0; i < n; i++) {
            randomFigures[i] = newFigure.getRandomFigure();
        }
        return randomFigures;
    }

    public static void printFigures(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
