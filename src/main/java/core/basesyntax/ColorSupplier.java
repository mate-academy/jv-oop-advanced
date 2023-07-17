package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();

    private Color[] colors = Color.values();
    private int index = rand.nextInt(colors.length);

    public String getRandomColor() {
        return colors[index].toString();
    }
}
