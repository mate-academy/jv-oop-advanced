package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {

    private SecureRandom secureRandom = new SecureRandom();

    public String getRandomColor() {
        int randomInt = secureRandom.nextInt(Color.values().length - 1);
        return Color.values()[randomInt].toString();
    }
}
