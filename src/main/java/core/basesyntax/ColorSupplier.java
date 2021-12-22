package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();
    private String[] colors = {"gray", "green", "violet", "black", "yellow"};

    public String getRandomColor() {
        int print = random.nextInt(colors.length);
        return colors[print];
    }
}
