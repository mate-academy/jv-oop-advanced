package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int length = random.nextInt(Color.values().length);
        String color = Color.values()[length].toString().toLowerCase();
        return color;
    }
}
