package suppliers;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"white", "black", "red", "orange",
            "yellow", "green", "blue", "purple"};
    private Random random = new Random();

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
