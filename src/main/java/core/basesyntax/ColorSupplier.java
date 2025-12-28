package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    String[] colors = {
            "red", "blue", "green", "purple", "orange", "yellow", "black", "white"
    };
    public String getRandomColor() {
        int RandomColor = new Random().nextInt(colors.length);
        return colors[RandomColor];
    }
}
