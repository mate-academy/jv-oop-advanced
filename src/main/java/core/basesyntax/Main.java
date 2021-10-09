package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;
import java.util.Random;

public class Main {
    public static final int MAX_ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int randomArrayLength = new Random().nextInt(MAX_ARRAY_SIZE);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] randomFigure = new Figure[randomArrayLength];
        for (int i = 0; i < randomFigure.length; i++) {
            randomFigure[i] = figureSupplier.getRandomFigure();
            randomFigure[i].draw();
        }
    }
}
