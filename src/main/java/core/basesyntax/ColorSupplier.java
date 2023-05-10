package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    public String getRandomColor() {
        int variant = random.nextInt(Color.values().length);
        switch (variant) {
            case (0): return Color.BLACK.name();
            case (1): return Color.SILVER.name();
            case (2): return Color.RED.name();
            case (3): return Color.GOLD.name();

            default: return Color.WHITE.name();
        }
    }
}
