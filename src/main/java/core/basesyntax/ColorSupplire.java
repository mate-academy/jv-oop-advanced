package core.basesyntax;

import java.util.Random;

public class ColorSupplire {
    private Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int numberColor = random.nextInt(colors.length);
        return colors[numberColor].name();
    }
}
