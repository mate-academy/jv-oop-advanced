package core.basesyntax.figure.name;

import java.util.Random;

public class FigureNameSupplier {
    private Random random = new Random();

    public FigureName getRandomName() {
        int index = random.nextInt(FigureName.values().length);
        return FigureName.values()[index];
    }
}
