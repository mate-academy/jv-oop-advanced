package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    public static String getRandomColor() {
        String[] colors = {"white", "blue", "green", "black", "yellow"};
        Random random = new Random();
        int index = random.nextInt(colors.length);

        return colors[index];
    }
}
