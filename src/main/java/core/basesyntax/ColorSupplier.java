package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private final SecureRandom randomColor = new SecureRandom();

    public Color getRandomColor() {
        int colorRandom = randomColor.nextInt(Color.values().length);
        return Color.values()[colorRandom];
    }
}
