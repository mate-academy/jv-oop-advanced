package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Random randomColor = new Random();
        Color[] values = Color.values();
        int randomIndex = randomColor.nextInt(values.length);
        return values[randomIndex].name();
    }
}
