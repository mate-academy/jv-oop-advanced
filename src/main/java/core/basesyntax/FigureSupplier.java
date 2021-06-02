package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public String getRandomFigure() {
        Figure[] values = Figure.values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex].name();
    }
}
