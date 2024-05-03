package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int rand = new Random().nextInt(5);

    public String generateRandomColor() {
        switch (rand) {
            case 0:
                return Color.RED.name();
            case 1:
                return Color.BLUE.name();
            case 2:
                return Color.GREEN.name();
            case 3:
                return Color.PINK.name();
            case 4:
                return Color.YELLOW.name();
            default:
                return Color.BLACK.name();
        }
    }
}
