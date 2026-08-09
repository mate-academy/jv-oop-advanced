package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"red", "green", "blue", "pink",
                "purple", "yellow", "black", "white", "brown"
        };
        int randIndex = new Random().nextInt(colors.length);
        String randomColor = colors[randIndex];
        return randomColor;
    }
}
