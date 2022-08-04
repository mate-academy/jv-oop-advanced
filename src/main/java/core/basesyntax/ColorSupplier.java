package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rand = new Random();
        return Color.values()[rand.nextInt(Color.values().length)].toString();
    }

    enum Color { PURPLE, BLUE, GREEN, YELLOW, ORANGE, RED, WHITE, GREY, BLACK }
}
