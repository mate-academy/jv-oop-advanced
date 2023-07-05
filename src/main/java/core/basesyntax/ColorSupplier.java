package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        String[] colors = {"red","blue","green","yellow","orange"};
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
