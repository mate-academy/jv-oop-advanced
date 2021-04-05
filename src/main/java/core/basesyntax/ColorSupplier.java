package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getColor() {
        Random generator = new Random();
        String[] colors = new String[2];
        colors[0] = "White";
        colors[1] = "Black";
        int randomIndex = generator.nextInt(colors.length);
        return colors[randomIndex];
    }
}
