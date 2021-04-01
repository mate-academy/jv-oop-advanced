package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_FIGURES = 50;

    public static void main(String[] args) {
        Random random = new Random();
        int lengthArrayFigure = random.nextInt(MAX_FIGURES);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] randomFigures = new Figure[lengthArrayFigure];

        for (int i = 0; i < randomFigures.length; i++) {
            randomFigures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure randomFigure : randomFigures) {
            randomFigure.draw();
        }
    }
}
