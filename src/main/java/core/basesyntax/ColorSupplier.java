package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        String[] colors = {"red", "green", "blue", "pink",
                "purple", "yellow", "black", "white", "brown"
        };
        int randIndex = random.nextInt(colors.length);
        String randomColor = colors[randIndex];
        return randomColor;
    }
}
