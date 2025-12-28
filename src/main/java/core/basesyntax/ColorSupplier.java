package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {
            "red", "blue", "green", "purple", "orange", "yellow", "black", "white"
    };
    private int randomColor = new Random().nextInt(colors.length);

    public String getRandomColor() {
        return colors[randomColor];
    }
}
