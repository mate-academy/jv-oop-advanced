package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {
            "red", "blue", "green", "purple", "orange", "yellow", "black", "white"
    };

    public String getRandomColor() {
        int randomColor = new Random().nextInt(colors.length);
        return colors[randomColor];
    }
}
