package core.basesyntax;

import core.basesyntax.enums.Figures;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public String getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        return Figures.values()[index].name();
    }
}
