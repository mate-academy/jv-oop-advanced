package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Random random = new Random();

    public String getRandomColor() {
        int i = random.nextInt(Color.values().length);
        return Color.values()[i].name();
    }

}
