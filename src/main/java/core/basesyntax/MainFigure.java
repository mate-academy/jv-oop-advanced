package core.basesyntax;

import java.util.Random;

public class MainFigure {

    public static void main(String[] args) {
        Random random = new Random();
        final int figureCount = 5;
        int figureNumber;

        FigureSupplier figureSupplier = new FigureSupplier();
        int quantityFigures = random.nextInt(figureCount) + 1;
        int[] numbersFigures = new int[figureCount];

        for (int i = 0; i < quantityFigures; i++) {
            figureNumber = random.nextInt(figureCount);
            if (numbersFigures[figureNumber] == 1) {
                i--;
                continue;
            } else {
                numbersFigures[figureNumber] = 1;
                figureSupplier.getRandomFigure(figureNumber);
            }
        }
    }
}

