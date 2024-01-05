package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int inedex = random.nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[inedex].name();
    }
}
