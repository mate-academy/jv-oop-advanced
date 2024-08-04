package core.basesyntax.service;

import java.util.concurrent.ThreadLocalRandom;

public class ColorSupplier {
    public String getRandomColor() {
        int randomIndex = ThreadLocalRandom.current().nextInt(Color.values().length);
        return Color.values()[randomIndex].getColorName();
    }

    private enum Color {
        RED, GREEN, BLACK, BLUE, WHITE;

        public String getColorName() {
            return this.name().charAt(0) + this.name().substring(1).toLowerCase();
        }
    }
}
