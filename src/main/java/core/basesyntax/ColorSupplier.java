package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random = new Random();
    
    public String getRandomColor() {
        private int amountOfColors = Color.values().length;
        return Color.values()[random.nextInt(amountOfColors)].name();
    }
}
