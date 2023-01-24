package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    String[] colors = {"BLACK", "WHITE", "GREEN", "PURPLE", "RED", "BLUE", "ORANGE"};

    Random random = new Random();

    public String getRandomColor() {
        int randomColorNumber = random.nextInt(colors.length);
        return colors[randomColorNumber];
    }
}
