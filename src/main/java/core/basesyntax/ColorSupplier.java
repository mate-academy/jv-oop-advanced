package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random rmd = new Random();
    
    public Color getRandomColor() {
        int index = rmd.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
