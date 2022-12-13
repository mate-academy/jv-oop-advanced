package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colors = Color.values();
    private Random rnd = new Random();

    public String getRandomColor() {
        return colors[rnd.nextInt(colors.length)].name();
    }
}
