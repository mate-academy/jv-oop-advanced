package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color [] color = Color.values();
        int index = random.nextInt(color.length);
        return color[index].toString();
    }
}
