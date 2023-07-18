package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();

    private Color[] color = Color.values();

    public String getRandomColor() {
        int index = rand.nextInt(color.length);
        return color[index].name();
    }
}
