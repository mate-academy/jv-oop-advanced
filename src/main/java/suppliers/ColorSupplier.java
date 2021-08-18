package suppliers;

import java.util.Random;

public class ColorSupplier {
    public static final String[] colours = {"white", "black", "red", "orange",
            "yellow", "green", "blue", "purple"};
    private Random random = new Random();

    public String getRandomColor() {
        return colours[random.nextInt(colours.length)];
    }
}
