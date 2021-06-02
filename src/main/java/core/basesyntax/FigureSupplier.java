package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static Figure getRandomFigure() {
        Figure[] values = Figure.values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}
