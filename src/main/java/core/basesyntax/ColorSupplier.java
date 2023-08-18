package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"blue", "green", "pink","red", "black", "white", "orange"};

    public String getRandomColor() {
        int index = new Random().nextInt(COLORS.length);
        return COLORS[index];
    }

}
