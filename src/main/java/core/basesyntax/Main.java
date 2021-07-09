package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int maxNumberOfFigures = 7;
        Random random = new Random();
        int numberOfFigures = random.nextInt(maxNumberOfFigures) + 1;

        Figure[] figures = new Figure[numberOfFigures];

        for (int i = 0; i < numberOfFigures; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }

        for (Figure figure: figures) {
            figure.drawFigure();
        }
    }
}
