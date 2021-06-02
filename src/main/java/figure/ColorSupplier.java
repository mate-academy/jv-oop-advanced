package figure;

import java.util.Random;

public class ColorSupplier {
    private static String[] colors = {"black", "blue",
            "green", "grey", "magenta", "orange",
            "purple", "red", "white", "yellow"};

    public static String getColor(int colorNumber) {
        return colors[colorNumber];
    }

    public static String getRandomColor() {
        return colors[Integer.parseInt(String.valueOf(new Random().nextInt(colors.length)))];
    }
}
