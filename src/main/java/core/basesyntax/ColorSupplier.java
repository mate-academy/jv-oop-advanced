package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int randomNumbers = random.nextInt(4);
        Color[] color = Color.values();
        return color[randomNumbers].toString();
    }
}
