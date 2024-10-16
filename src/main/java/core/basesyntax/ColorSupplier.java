package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColor = new Random();
    private final Color[] colors = Color.values();

    public String getRandomColor() {
        int index = randomColor.nextInt(Color.values().length);
        return colors[index].name();
    }
}
