package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(Colors.values().length);
        String randomColor = Colors.values()[randomIndex].name();
        return randomColor;
    }
}
