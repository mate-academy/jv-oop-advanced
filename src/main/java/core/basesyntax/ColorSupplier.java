package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomValue = new Random();
        return Color.values()[randomValue
                .nextInt(Color.values().length)].name().toLowerCase();
    }
}
