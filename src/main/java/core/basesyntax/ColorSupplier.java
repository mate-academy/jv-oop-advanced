package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {

        String[] colors = {"red", "blue", "green", "yellow", "orange", "purple", "pink", "cyan", "magenta", "brown"};

        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);

        return colors[randomIndex];
    }

}
