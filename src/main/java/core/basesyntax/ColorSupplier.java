package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {
            "yellow",
            "blue",
            "white",
            "green",
            "red",
    };
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
