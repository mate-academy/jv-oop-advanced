package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] color = new String[] {"blue", "green", "orange", "yellow", "purple", "brown",
            "gray", "red", "black", "pink", "cyan"};

    public String getRandomColor() {
        Random randomColor = new Random();
        int index = randomColor.nextInt(color.length);
        return color[index];
    }
}
