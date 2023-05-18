package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final String[] COLORS = {"Red", "Blue", "Green", "Yellow", "Orange"};

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }

}
