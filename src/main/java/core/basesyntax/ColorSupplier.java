package core.basesyntax;

import java.util.Random;

public interface ColorSupplier {
    default Color getRandomColor() {
        Random random = new Random();
        Color[] arrayColors = Color.values();
        int index = random.nextInt(arrayColors.length - 1);
        return arrayColors[index];
    }
}
