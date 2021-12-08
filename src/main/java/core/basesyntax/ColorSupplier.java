package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    String randomColor = getRandomColor();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
