package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private final SecureRandom randomColor = new SecureRandom();

    public Color getRandomColor() {
        return Color.values()[randomColor.nextInt(Color.values().length)];
    }
}
