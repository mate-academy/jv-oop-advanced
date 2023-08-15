package core.basesyntax.figures.figurehandlers;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(Color.values().length);
        return Color.values()[randomIndex].name().toLowerCase();
    }
}
