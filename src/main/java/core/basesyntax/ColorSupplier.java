package core.basesyntax;

import java.util.Random;

/**
 * The ColorSupplier class generates a random color from the Color enum values.
 */
public class ColorSupplier {
    /**
     * The random object used to generate random numbers.
     */
    private Random random = new Random();

    /**
     * Returns a random color from the Color enum values.
     * @return a random color as a string.
     */
    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)].name();
    }
}
