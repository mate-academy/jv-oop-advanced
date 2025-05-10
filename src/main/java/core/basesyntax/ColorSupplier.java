package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int indexRandom = random.nextInt(Color.values().length);
        Color randomColor = Color.values()[indexRandom];
        return randomColor.name();
    }
}
