package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random colorNumber = new Random();

        switch (colorNumber.nextInt(6) + 1) {
            case 1: return Color.RED;
            case 2: return Color.ORANGE;
            case 3: return Color.YELLOW;
            case 4: return Color.GREEN;
            case 5: return Color.CYAN;
            case 6: return Color.BLUE;
            case 7: return Color.PURPLE;
            default: return null;
        }
    }
}
