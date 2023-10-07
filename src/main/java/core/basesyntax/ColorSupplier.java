package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] colors = new Color[]{Color.Blue, Color.Red,
            Color.Yellow, Color.Green, Color.Black};

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].toString();
    }
}
