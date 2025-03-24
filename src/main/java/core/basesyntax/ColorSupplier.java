package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int index = new Random().nextInt(colors.length);
        return colors[index].name().toLowerCase();
    }

    public String getWhiteColor() {
        return Colors.WHITE.toString().toLowerCase();
    }
}
