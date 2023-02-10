package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private final SecureRandom secureRandom = new SecureRandom();

    public Color getColor() {
        int colorIndex = secureRandom.nextInt(Color.values().length);
        return Color.values()[colorIndex];
    }
}
