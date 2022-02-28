package core.basesyntax.model;

import java.util.Random;

/**
 * @version 1.0
 * @autor shd
 * @created by 28/02/2022 - 12:36
 * @project jv-oop-advanced
 */
public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        Color color = colors[random.nextInt(colors.length)];
        return color;
    }

}
