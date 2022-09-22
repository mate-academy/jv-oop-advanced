package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int colorNumber;
    private Random random = new Random();
    
    public String getRandomColor() {
        colorNumber = random.nextInt((Color.values().length));
        return Color.values()[colorNumber].name();
    }
}
