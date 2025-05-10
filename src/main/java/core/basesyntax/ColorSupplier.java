package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int randomIndex = random.nextInt();
        return Colors.values()[randomIndex].name();
    }
}
