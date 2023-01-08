package core.basesyntax.figure.name;

import java.util.Random;

public class FigureNameSupplier {
    private Random random = new Random();

    public String getRandomName() {
        int index = random.nextInt(NameFigure.values().length);
        return NameFigure.values()[index].name();
    }
}
