package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String [] colors = {"Red", "Orange", "Green", "Yellow", "Blue", "Violet", "Black"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
