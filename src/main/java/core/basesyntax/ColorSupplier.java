package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(FigureColor.values().length);
        return FigureColor.values()[index].toString();
    }
}
