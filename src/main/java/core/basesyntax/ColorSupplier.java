package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private final SecureRandom random = new SecureRandom();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
