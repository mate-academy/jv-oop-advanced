package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
        private static final String[] COLORS = {"червоний", "зелений", "синій", "жовтий", "чорний"};

    public String getRandomColor() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}
