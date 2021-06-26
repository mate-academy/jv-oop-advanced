package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"Red", "Blue", "Green", "Yellow", "Grey"};

    public String getRandomColor() {
        int indexOfColor = new Random().nextInt(colors.length);
        return colors[indexOfColor];
    }
}
