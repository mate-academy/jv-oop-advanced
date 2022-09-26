package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        String randomColor = Color.values()[index].toString();
        return randomColor.toLowerCase();
    }
}
