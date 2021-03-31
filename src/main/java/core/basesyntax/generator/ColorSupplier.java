package core.basesyntax.generator;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = 5;

    public String setColors() {
        Random random = new Random();
        String color;
        int colorNumber = random.nextInt(NUMBER_OF_COLORS);
        switch (colorNumber) {
            case 0:
                color = Colors.RED.toString();
                break;
            case 1:
                color = Colors.GREEN.toString();
                break;
            case 2:
                color = Colors.BLUE.toString();
                break;
            case 3:
                color = Colors.YELLOW.toString();
                break;
            case 4:
                color = Colors.PURPLE.toString();
                break;
            default:
                color = "Haven`t color";
                break;
        }
        return color;
    }
}
