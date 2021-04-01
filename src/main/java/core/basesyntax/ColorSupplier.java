package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random colorNumber = new Random();

        switch (colorNumber.nextInt(Color.values().length)) {
            case 0: return Color.RED;
            case 1: return Color.ORANGE;
            case 2: return Color.YELLOW;
            case 3: return Color.GREEN;
            case 4: return Color.CYAN;
            case 5: return Color.BLUE;
            default: return Color.PURPLE;
        }
    }
}
