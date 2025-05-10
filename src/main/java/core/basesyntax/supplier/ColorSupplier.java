package core.basesyntax.supplier;

import java.util.Random;

public class ColorSupplier {
    private enum FigureColorEnum {
        RED,
        BLACK,
        WHITE,
        GREEN,
        YELLOW,
        BLUE,
        PURPLE;
    }

    private final Random rand = new Random();

    public String getRandomColor() {
        return FigureColorEnum
                .values()[rand.nextInt(FigureColorEnum.values().length)]
                .name().toLowerCase();
    }
}
