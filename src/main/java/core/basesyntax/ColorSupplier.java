package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOUR_COUNT = 5;
    private Random random = new Random();

    public String getRandomColor() {
        String [] colors = new String[]{"Colors:","Red","Blue","Green","Black","White"};
        int colorNumber = random.nextInt(COLOUR_COUNT);
        return colors[colorNumber];
    }
}
