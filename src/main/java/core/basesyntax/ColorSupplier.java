package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor() {
        Color [] color = Color.values();
        int index = random.nextInt(color.length);
        return color[index].name();
    }
}
