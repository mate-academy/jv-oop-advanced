package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomColors = new Random();
        int randomColor = randomColors.nextInt(Colors.values().length);

        return Colors.values()[randomColor].name();
    }
}
