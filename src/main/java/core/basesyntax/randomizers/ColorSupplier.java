package core.basesyntax.randomizers;

import core.basesyntax.enums.Color;
import java.security.SecureRandom;

public class ColorSupplier {
    private final SecureRandom random = new SecureRandom();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name().toLowerCase();
    }
}
