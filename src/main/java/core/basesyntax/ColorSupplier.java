package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();

    private Color[] color = Color.values();

    private int index = rand.nextInt(color.length);

    public String getRandomColor() {
        return color[index].name();
    }
}
