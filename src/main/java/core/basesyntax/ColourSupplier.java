package core.basesyntax;

import java.util.Random;

public class ColourSupplier {
    private static final int COLOUR_COUNT = 9;
    private Random random = new Random();
    
    public String getRandomColor() {
        int index = random.nextInt(COLOUR_COUNT);
        return Colour.values()[index].name();
    }
}
