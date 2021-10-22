package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color randomColor = Color.values()[new Random().nextInt(Color.values().length)];
        return randomColor.toString();
    }
}
