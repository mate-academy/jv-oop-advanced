package core.basesyntax;

import java.util.Random;

public class ColorRandom {

    private static final String[] COLORS = {"red", "green", "blue", "yellow", "black"};
    private final Random random = new Random();

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }

}
