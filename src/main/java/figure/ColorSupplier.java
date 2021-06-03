package figure;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"black", "blue",
            "green", "grey", "magenta", "orange",
            "purple", "red", "white", "yellow"};

    public static String getRandomColor() {
        return colors[(new Random().nextInt(colors.length))];
    }
}
