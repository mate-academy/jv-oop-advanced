package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private final SecureRandom secureRandom = new SecureRandom();

    public Colors getColor() {
        return Colors.values()[secureRandom.nextInt(Colors.values().length)];
    }
}
