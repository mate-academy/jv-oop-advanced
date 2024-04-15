package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private String randomColor;
    private final String[] colors = {
            "red",
            "blue",
            "white",
            "green",
            "yellow",
            "orange",
            "purple",
            "pink",
            "brown",
            "black",
            "cyan",
            "magenta",
            "lime",
            "teal",
            "silver",
            "gold",
            "maroon",
            "olive",
            "navy",
            "indigo"
    };

    public String getRandomColor() {
        int randomNumber = random.nextInt(colors.length);
        return randomColor = colors[randomNumber];
    }

}
