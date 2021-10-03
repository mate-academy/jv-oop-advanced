package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        final String[] COLORS = new String[] {"red", "green", "yellow", "blue", "black", "white"};
        int randomColor = new Random().nextInt(COLORS.length);
        return COLORS[randomColor];
    }
}