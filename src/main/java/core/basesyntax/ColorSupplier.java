package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] color = {"White", "Red", "Yellow", "Blue", "Black"};
        int index = new Random().nextInt(color.length);
        String randomColor = color[index];
        return randomColor;
    }
}
