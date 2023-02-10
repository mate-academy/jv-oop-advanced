package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private final SecureRandom secureRandom = new SecureRandom();

    public Color getColor() {
        return Color.values()[secureRandom.nextInt(Color.values().length)];
    }
}
