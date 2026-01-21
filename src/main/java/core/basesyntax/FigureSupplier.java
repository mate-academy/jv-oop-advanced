package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random figure = new Random();
    private static final int MAX_NUMBER = 5;

    public String getRandomFigure() {
        int index = figure.nextInt(MAX_NUMBER);
        return figure.toString();
    }
}
