package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static String[] colors;
    private static Random random;

    public ColorSupplier() {
        random = new Random();

        colors = new String[]{
                "Red",
                "Green",
                "Blue",
                "Yellow",
                "Orange",
                "Gray"
        };
    }

    public String getRandomColor() {
        // Randomly choose an index from the array
        int randomIndex = random.nextInt(colors.length);

        // Get the color code at the randomly chosen index
        String randomColor = colors[randomIndex];

        return randomColor;
    }
}
