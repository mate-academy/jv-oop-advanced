package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Random rand = new Random();
        int a = rand.nextInt(7);
        Colors color = Colors.values()[rand.nextInt(Colors.values().length)];
        return color.toString();
    }
}
