package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum COLORS {
        Red,
        Blue,
        Black,
        White,
        Yellow,
        Pink
    }
    private final Random random = new Random();
    public String getRandomColor() {
        COLORS[] colors = COLORS.values();
        int index = random.nextInt(colors.length);
        return colors[index].name();   
    }
    
}
