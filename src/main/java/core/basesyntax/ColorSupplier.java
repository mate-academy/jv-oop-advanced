package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public void getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        int randomIndex = random.nextInt(colors.length);
    }
}
