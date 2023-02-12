package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final int index = random.nextInt(FigureColor.values().length);


    public String getRandomColor() {
        return FigureColor.values()[index].name();
    }
}
