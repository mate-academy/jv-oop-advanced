package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public MyColor getRandomColor() {
        MyColor[] colors = MyColor.values();
        int colorIndex = random.nextInt(colors.length);
        return colors[colorIndex];
    }
}
