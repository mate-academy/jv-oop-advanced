package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"red", "blue", "green", "yellow", "orange", "purple"};
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
