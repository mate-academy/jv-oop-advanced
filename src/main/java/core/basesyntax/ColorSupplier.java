package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Random random = new Random();
        String[] colors = {"Gray", "Green", "Red", "Blue", "Black", "Yellow"};
        return colors[random.nextInt(colors.length)];
    }
}
