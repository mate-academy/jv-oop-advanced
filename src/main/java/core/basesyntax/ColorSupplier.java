package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] color = {"green", "blue", "brown", "purple", "yellow"};
    private final Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(color.length);
        return color[randomIndex];
    }
}
