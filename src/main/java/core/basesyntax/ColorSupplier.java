package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(Color.values().length);
        switch (colorNumber) {
            case 0:
                return Color.WHITE.name();
            case 1:
                return Color.PURPLE.name();
            case 2:
                return Color.RED.name();
            case 3:
                return Color.BLUE.name();
            case 4:
                return Color.GREEN.name();
            default:
                return Color.YELLOW.name();
        }
    }
}
