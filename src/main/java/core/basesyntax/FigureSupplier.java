package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomOption = random.nextInt();
    }

    public Figure getDefaultFigure() {

    }
}
