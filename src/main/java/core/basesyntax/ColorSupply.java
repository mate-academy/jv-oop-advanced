package core.basesyntax;

import java.util.Random;

public class ColorSupply {
    private final Random random = new Random();

    public String getRandomColor() {
        return String.valueOf(Color.values()[random.nextInt(Color.values().length)]).toLowerCase();
    }
}
