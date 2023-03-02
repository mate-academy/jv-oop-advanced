package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        String[] colors = {"Red", "Black", "White", "Green", "Yellow", "Blue"};
        int index = random.nextInt(5);
                return colors[index];
    }
}
