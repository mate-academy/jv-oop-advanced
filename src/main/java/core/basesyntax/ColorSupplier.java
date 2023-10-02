package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] colorArray = Color.values();

    public String getRandomColor() {
        int index = random.nextInt(colorArray.length);
        return colorArray[index].name();
    }
}
