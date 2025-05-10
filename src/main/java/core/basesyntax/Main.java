package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();

        int arraySize = calculateArraySize(random);
        Figure[] figures = new Figure[arraySize];

        int halfSize = arraySize / 2;

        for (int i = 0; i < halfSize; i++) {
            if (arraySize > halfSize) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }

    private static int calculateArraySize(Random random) {
        return random.nextInt(4) + 3;
    }
}
