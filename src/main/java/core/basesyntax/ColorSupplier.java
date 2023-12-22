package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color figureColor = Color.values()[index];
        return String.valueOf(figureColor);
    }
}
