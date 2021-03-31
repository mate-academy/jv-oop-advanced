package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static String [] colors = new String [] {"blue", "green", "orange", "purple", "red"};

    public static String chooseColor() {
        Random random = new Random();
        int position = random.nextInt(colors.length);
        return colors[position];
    }
}
