package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"black", "green", "blue", "red", "white", "grey"};

    public String getRandomColor() {
        Random random = new Random();
        random.nextInt(colors.length);
        return colors[random.nextInt(colors.length)];
    }
}
