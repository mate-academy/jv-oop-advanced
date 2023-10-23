package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] Colors = {"purple", "blue", "green", "red", "silver"};

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Colors.length);
        return Colors[index];
    }

}
