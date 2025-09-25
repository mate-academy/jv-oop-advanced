package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Colors[] colors = Colors.values();
    private final Random rg = new Random();

    public String getRandomColor() {
        return colors[rg.nextInt(Constant.NUMBER_OF_COLORS)].name();
    }
}
