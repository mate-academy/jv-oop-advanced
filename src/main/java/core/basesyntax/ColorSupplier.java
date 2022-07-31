package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int INDEX_COLOR = 9;

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(INDEX_COLOR);
        String result = Color.values()[index].toString();
        return result;
    }
}
