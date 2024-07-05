package core.basesyntax.color;


import java.util.Random;

public class ColorSupplier {

    private static final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return String.valueOf(colors[index]);
    }
}
