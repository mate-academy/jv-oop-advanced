package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static String[] colorsContainer = new String[] {
            "blue", "red", "green"
    };

    public String getRandomColor() {
        return colorsContainer[new Random().nextInt(colorsContainer.length)];
    }
}
