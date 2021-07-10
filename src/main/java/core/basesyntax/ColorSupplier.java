package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 9;

    private static final String ORANGE = "Orange";
    private static final String YELLOW = "Yellow";
    private static final String GREEN = "Green";
    private static final String BLUE = "Blue";
    private static final String RED = "Red";
    private static final String CYAN = "Cyan";
    private static final String PURPLE = "Purple";
    private static final String WHITE = "White";
    private static final String BLACK = "Black";

    public String getColorByNumber(int colorNumber) {
        String color;
        switch (colorNumber) {
            case 2:
                color = ORANGE;
                break;
            case 3:
                color = YELLOW;
                break;
            case 4:
                color = GREEN;
                break;
            case 5:
                color = BLUE;
                break;
            case 6:
                color = RED;
                break;
            case 7:
                color = CYAN;
                break;
            case 8:
                color = PURPLE;
                break;
            case 9:
                color = WHITE;
                break;
            default:
                color = BLACK;
                break;
        }
        return color;
    }

    public String getRandomColor() {
        Random random = new Random();
        int colorNumber = random.nextInt(COLOR_COUNT);
        return getColorByNumber(colorNumber);
    }
}
